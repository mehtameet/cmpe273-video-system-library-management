package VideoLibrary;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;

import entity.AccountDetails;
import entity.Customer;
import entity.Movie;
import entity.MovieAccountDetail;
import entity.MovieCategory;
import entity.Transactions;

public class DatabaseConnection {


	Connection con = null;
	static ResultSet rs;
	Statement stmt = null;
	ConnectionPool connectionPool = null;
	

	DatabaseConnection() {
		/*		try {
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					con = DriverManager.getConnection(
							"jdbc:mysql://localhost/videolibrary", "root",
							"root");
					stmt = con.createStatement();
					if (!con.isClosed())
						System.out.println("Successfully Connected!!!");
				} catch (SQLException e) {
					
					e.printStackTrace();
				} catch (InstantiationException e) {
					
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					
					e.printStackTrace();
				}*/
				
				connectionPool = ConnectionPool.getInstance();
				try {
					con = connectionPool.getConnection();
					stmt = con.createStatement();
					if (!con.isClosed())	
						System.out.println("Successfully Connected!!!");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
	public boolean issueMovies(int[] columnId, String[] movieDetails, int[] movieIds, int amountPaid, String transactionDate){

		// columnId and movieDetail should be corresponding.
		// movieId should either be null if u are adding a new video else for
		// updation u shud be passing the respective movieId.
		int j, rowcount = 0;
		int transactionId = 0;
		DatabaseConnection db = new DatabaseConnection();

		String[] columnName = { "membershipId", "issueDate",
				"dueDate", "actualReturnDate", "fineAmount", "isActive" };

		
		//To check integer columns.
		ArrayList<String> intColumns = new ArrayList<String>();
		intColumns.add("membershipId");
		intColumns.add("movieId");
		intColumns.add("fineAmount");
		boolean isSuccess = false;
		String usrType = null;
		String userType;
		
		try {
			
			//Insert the transaction.
			CallableStatement cs = con.prepareCall("{ call sp_Ins_transaction(?,?,?,?) }");
			cs.setInt(1, Integer.parseInt(movieDetails[0]));
			cs.setInt(2, amountPaid);
			cs.setString(3, transactionDate);
			cs.registerOutParameter(4, Types.INTEGER);
			cs.executeQuery();
			transactionId = cs.getInt(4);
			System.out.println(transactionId);
			
		} catch (SQLException e4) {			
			e4.printStackTrace();
		}		
		
		//Get user type based on membership ID.		
		userType = "select userType from userdetails where membershipId = "+movieDetails[0]+";";
		try {
			rs = db.stmt.executeQuery(userType);
			rs.next();
			usrType = rs.getString(1);
		} catch (SQLException e3) {			
			e3.printStackTrace();
		}
		
for(int i=0;i<movieIds.length;i++)
{
	int movieId = movieIds[i];
		if (movieId != 0) {
			if (isMovie(movieId)) {				
			int numberOfMoviesIssues;
			int k = 0;
			boolean bln = false;			
			ResultSet rs;

			StringBuffer query = new StringBuffer();
			String queryMoviesIssued = new String();
			
			try {
				
				if(usrType.equals("P")){
					queryMoviesIssued = "select numberOfMoviesIssued from premiumcustomer where membershipId = '"
							+ movieDetails[0] + "';";
					rs = db.stmt.executeQuery(queryMoviesIssued);
					
					try {	
						
						if (rs.next()) {
							int count = rs.getInt(1);
							if (count < 10) {
								query.append("Insert into rentaltransactions (transactionId,membershipId,movieId,issueDate,dueDate,actualReturnDate,fineAmount,isActive) values("+transactionId+",");
							
								for (j = 0; j < movieDetails.length-1; j++) {
									
									if(k==1){
										if (intColumns.contains(columnName[k])) {
											query.append(movieId + ",");
											j--;
											k=2;
										} else {
											query.append("'");
											query.append(movieId + "',");
											j--;
											k=2;
										}
									}else{
									if (intColumns.contains(columnName[j])) {
										query.append(Integer.parseInt(movieDetails[j])
												+ ",");
										k++;
									} else {
										query.append("'");
										query.append(movieDetails[j] + "',");
										k++;
									}
									}
								}
								if (intColumns.contains(columnName[j])) {
									query.append("" + Integer.parseInt(movieDetails[j]) + ");");
								} else {
									query.append("'" + movieDetails[j] + "');");
								}
								
								try {
									
									count+=1;
									
									CallableStatement cs = con.prepareCall("{ call sp_Upd_moviecount_premiumcustomer(?,?,?,?) }");
									cs.setString(1, query.toString());
									cs.setInt(2, count);
									cs.setInt(3, Integer.parseInt(movieDetails[0]));
									cs.setInt(4, movieId);
									rs = cs.executeQuery();
									rs.next();
									isSuccess = true;
							}
								catch(SQLException e){
									e.printStackTrace();
								}
							}
							else{
								isSuccess = false;
								break;
							}
							}
					} catch (SQLException e1) {					
						e1.printStackTrace();
					}
					}
									
				if(usrType.equals("S")){
					queryMoviesIssued = "select numberOfMoviesIssued from simplecustomer where membershipId = '"
							+ movieDetails[0] + "';";
					rs = db.stmt.executeQuery(queryMoviesIssued);
					
					try {	
						
						if (rs.next()) {
							int count = rs.getInt(1);
							if (count < 2) {
								query.append("Insert into rentaltransactions (transactionId,membershipId,movieId,issueDate,dueDate,actualReturnDate,fineAmount,isActive) values("+transactionId+",");
								
								for (j = 0; j < movieDetails.length-1; j++) {
									
									if(k==1){
										if (intColumns.contains(columnName[k])) {
											query.append(movieId + ",");
											j--;
											k=2;
										} else {
											query.append("'");
											query.append(movieId + "',");
											j--;
											k=2;
										}
									}else{
									if (intColumns.contains(columnName[j])) {
										query.append(Integer.parseInt(movieDetails[j])
												+ ",");
										k++;
									} else {
										query.append("'");
										query.append(movieDetails[j] + "',");
										k++;
									}
									}
								}
								if (intColumns.contains(columnName[j])) {
									query.append("" + movieDetails[j] + ");");
								} else {
									query.append("'" + movieDetails[j] + "');");
								}
								
								try {										
										count+=1;
										
										CallableStatement cs = con.prepareCall("{ call sp_Upd_moviecount_simplecustomer(?,?,?,?) }");
										cs.setString(1, query.toString());
										cs.setInt(2, count);
										cs.setInt(3, Integer.parseInt(movieDetails[0]));
										cs.setInt(4, movieId);
										rs = cs.executeQuery();
										rs.next();
										isSuccess = true;
									
								} catch (SQLException e) {									
									e.printStackTrace();
								}
							}
							else{
								isSuccess = false;
								break;
							}
						}
					} catch (SQLException e1) {						
						e1.printStackTrace();
					}
					
					}
				

			} catch (SQLException e2) {
				e2.printStackTrace();
			}finally{
				connectionPool.free(con);
			}
		
		}}}
		return isSuccess;
	
	}
	
	public boolean returnMovies(int userID, int[] movieIds){
		boolean bln=false;
		
		for(int i=0;i<movieIds.length;i++){
			try{
		CallableStatement cs = con.prepareCall("{ call sp_Upd_returnMovies(?,?) }");
		cs.setInt(1, userID);
		cs.setInt(2, movieIds[i]);		
		cs.executeQuery();
		bln = true;
			}catch(Exception e){
				bln = false;
				e.printStackTrace();
			}finally{
				connectionPool.free(con);
			}
		}
		return bln;
	}
	
	public boolean deleteMovies(int[] movieIds){
		
		boolean bln = false;
		String movieStr = "";
		for(int i=0;i<movieIds.length;i++){
			movieStr += "'"+movieIds[i] +"',";			
		}
		movieStr = movieStr.substring(0,movieStr.length()-1);
		try{
			/*CallableStatement cs = con.prepareCall("{ call sp_del_Movies(?) }");
			cs.setString(1, movieStr);					
			cs.executeQuery();*/
			Statement S = con.createStatement();
			S.executeUpdate("Update movie mv SET mv.isActive = 'F' WHERE mv.movieId in ("+movieStr+");");
			bln = true;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connectionPool.free(con);
		}
		return bln;
	}
	
	public boolean deleteUser(int[] userId){
		
		boolean bln = false;
		String userIdStr = "";
		for(int i=0;i<userId.length;i++){
			userIdStr += "'"+userId[i] +"',";			
		}
		userIdStr = userIdStr.substring(0,userIdStr.length()-1);
		try{
			Statement S = con.createStatement();
			S.executeUpdate("Update userdetails usrdtls SET usrdtls.isActive = 'F' WHERE usrdtls.membershipId in ("+userIdStr+");");
			bln = true;
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			connectionPool.free(con);
		}
		return bln;
	}
	
	public Customer signIn(String emailId, String password) {
		Customer customer = null;
		ResultSet rs;
		String query;
		try {
			if (password == null) {
				query = "select * from userDetails where emailId = '"
						+ emailId + "';";
			} else {
				query = "select * from userDetails where emailId = '"
						+ emailId + "' and password = '" + password + "';";
			}
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				customer = new Customer();
				customer.setMembershipId(rs.getInt("membershipId"));
				customer.setEmailId(rs.getString("emailId"));
				customer.setFirstName(rs.getString("firstName"));
				customer.setLastName(rs.getString("lastName"));
				customer.setDateOfBirth(rs.getString("dateOfBirth"));
				customer.setAddress(rs.getString("address"));
				customer.setCity(rs.getString("city"));
				customer.setState(rs.getString("state"));
				customer.setZipCode(rs.getInt("zipCode"));
				customer.setGender(rs.getString("gender"));
				customer.setUserType(rs.getString("userType"));
				customer.setExpiryDate(rs.getString("expiryDate"));
				customer.setRegistrationDate(rs.getString("registrationDate"));
				System.out.println("Select Successful");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			connectionPool.free(con);
		}
		return customer;
	}
	
	public boolean isMember(int membershipId) {
		boolean isMember = false;
		ResultSet rs;
		String query;
		try {
				query = "select count(*) from userDetails where membershipId = '"
						+ membershipId + "'";
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				int count = rs.getInt(1);
				if(count == 1){
					isMember = true;					
					System.out.println("Unique member!");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			connectionPool.free(con);
		}
		return isMember;
	}
	

	public boolean isMovie(int movieId){
		DatabaseConnection db = new DatabaseConnection();
				
		boolean isMovie = false;
		ResultSet rs;
		String query;
		try {
				query = "select count(*) from movie where movieId = "
						+ movieId + ";";
			
			rs = db.stmt.executeQuery(query);
			if (rs.next()) {
				int count = rs.getInt(1);
				if(count == 1){
					isMovie = true;					
					System.out.println("Unique movie!");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			connectionPool.free(con);
		}		
		return isMovie;
	}
	
	public Customer[] searchUsers(int searchBy, String searchValue, int lowerLimit, int upperLimit, String userType){
		String[] columnName = {"","issueDate","dueDate","fineAmount"};
		ArrayList<String> intColumns = new ArrayList<String>(); 
		intColumns.add("membershipId");	
		intColumns.add("fineAmount");
		
		Customer[] custList = null;
		Customer objCust = null;
		Movie objMovie = null;		
		Movie[] arrMovie = null;
		Transactions[] arrTrans = null;
		try{			
			if(searchBy == 0 || searchBy == 1 || searchBy == 2 || searchBy == 3){
				
				Transactions objTrans = null;				
				
				CallableStatement cs = con.prepareCall("{ call sp_sel_searchUsersbyTypeCount(?,?,?,?) }");
				cs.setInt(1, searchBy);
				cs.setString(2, searchValue);
				cs.registerOutParameter(3, Types.INTEGER);
				cs.setString(4, userType);
				cs.executeQuery();
				int count= cs.getInt(3);
				
				CallableStatement c = con.prepareCall("{ call sp_sel_searchUsersbyType(?,?,?) }");
				c.setInt(1,searchBy);
				c.setString(2,searchValue);
				c.setString(3, userType);
				ResultSet rs = c.executeQuery();
				
				int limitdifference = upperLimit - lowerLimit;
				if(limitdifference < count){
					count = upperLimit;
				}
				
				
				custList = new Customer[count];
				
				for(int i=0;i<count;i++){
					objMovie = new Movie();
					objCust = new Customer();
					objTrans = new Transactions();
					
					if(rs.next()){
					arrMovie = new Movie[1];
					arrTrans = new Transactions[1];
					objCust.setMembershipId(rs.getInt(1));
					objCust.setFirstName(rs.getString(2));
					objCust.setLastName(rs.getString(3));
					objCust.setEmailId(rs.getString(4));
					
					objMovie.setMovieName(rs.getString(5));
					arrMovie[0] = objMovie;
					objCust.setObjMovieDtls(arrMovie);
					
					objTrans.setIssueDate(rs.getString(6));
					objTrans.setDueDate(rs.getString(7));
					objTrans.setFineamount(rs.getString(8));
					arrTrans[0] = objTrans; 
					objCust.setObjTrans(arrTrans);
					
					custList[i] = objCust; 
					}
				}
				return custList;
			}			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return custList;
	}

	
	

	public Movie[] searchMovies(int searchBy, String searchValue, int lowerLimit, int upperLimit){

		/* String [] fieldName = {"firstName","lastName"};
		 * String query = "select * from tableName where '"+ fieldName[searchBy] + "' = '"+ searchValue + "'";
		 */
		String[] columnName = {"","movieName","movieCategoryId","bannerName","releaseDate","movieRating"};
		ArrayList<String> intColumns = new ArrayList<String>(); 
		intColumns.add("movieCategoryId");
		
		
		Movie[] movieList = null;
		int count;
		try {
			String countQuery,query;
			if (searchBy == 0) {
				countQuery = "select count(1) from movie m, moviecategory mc where m.movieCategoryId = mc.movieCategoryId and m.isActive='T';";
				query = "select * from movie m, movieCategory mc where m.movieCategoryId = mc.movieCategoryId and m.isActive='T' limit " + lowerLimit + ", " + upperLimit +  ";";
			} else if(searchBy > 3){
				countQuery = "select count(1) from movie m, moviecategory mc where m.movieCategoryId = mc.movieCategoryId and m.isActive='T';";
				query = "select * from movie m, moviecategory mc where m.movieCategoryId = mc.movieCategoryId and m.isActive='T' order by "+columnName[searchBy]+"  Desc limit " + lowerLimit + ", " + upperLimit +  ";";
			} else {
				if (intColumns.contains(columnName[searchBy])) {
					countQuery = "select count(1) from movie m, moviecategory mc where m."
							+ columnName[searchBy]
							+ " = "
							+ searchValue
							+ " and m.movieCategoryId = mc.movieCategoryId and m.isActive='T';";
					query = "select * from movie m, movieCategory mc where m."
							+ columnName[searchBy]
							+ " = "
							+ searchValue
							+ " and m.movieCategoryId = mc.movieCategoryId and m.isActive='T' limit " + lowerLimit + ", " + upperLimit +  ";";
				} else {
				countQuery = "select count(1) from movie m, moviecategory mc where m."
						+ columnName[searchBy]
						+ " like '%"
						+ searchValue
						+ "%' "
						+ "and m.movieCategoryId = mc.movieCategoryId and m.isActive='T';";
				query = "select * from movie m, movieCategory mc where m."
						+ columnName[searchBy]
						+ " like '%"
						+ searchValue
						+ "%' "
						+ "and m.movieCategoryId = mc.movieCategoryId and m.isActive='T' limit " + lowerLimit + ", " + upperLimit +  ";";
				}
			}
			rs = stmt.executeQuery(countQuery);
			rs.next();
			count = rs.getInt(1);
			int limitdifference = upperLimit - lowerLimit;
			if(limitdifference < count){
				count = upperLimit;
			}
			movieList = new Movie[count];
			
			rs = stmt.executeQuery(query);
			for (int i = 0; rs.next(); i++) {
				Movie movie = new Movie();
				movie.setMovieId(rs.getInt("movieId"));
				movie.setMovieName(rs.getString("movieName"));
				movie.setMovieDescription(rs.getString("movieDesc"));
				movie.setReleaseDate(rs.getString("releaseDate"));
				movie.setMovieCategoryName(rs.getString("movieCategoryName"));
				movie.setMovieCategoryId(rs.getInt("movieCategoryId"));
				movie.setMovieBanner(rs.getString("movieBanner"));
				movie.setAvailableCopies(rs.getInt("availableCopies"));
				movie.setMovieRating(rs.getInt("movieRating"));
				movie.setMovieRent(rs.getInt("movieRent"));
				movie.setMovieHits(rs.getInt("movieHits"));
				movieList[i] = movie;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			connectionPool.free(con);
		}
		
		return movieList;
		
	}
	
	public MovieCategory[] getMovieCategoryList()
	{
		ResultSet rs;
		String query;
		String countQuery;
		int Count = 0;
		int index=0;
		MovieCategory[] movieCategory = null;
				
		try {
				query = "select * from moviecategory";
				countQuery = "select count(1) from moviecategory";
				
				rs = stmt.executeQuery(countQuery);
				if (rs.next()) {
					 Count = rs.getInt(1);
				}
				
				movieCategory = new MovieCategory[Count];
				
				rs = stmt.executeQuery(query);
				
				while (rs.next()) {
					MovieCategory movie = new MovieCategory();
					movie.setMovieCategoryId(rs.getInt("movieCategoryId"));
					movie.setMovieCategoryName(rs.getString("movieCategoryName"));
					movieCategory[index] = movie;
					index++;
				}
			}
		 catch (SQLException e) {
			e.printStackTrace();
		}finally{
			connectionPool.free(con);
		}
		
		return movieCategory;
		
	}
	
	private String getUserType(int membershipId)
	{
		String userType = null;
		try {
			String query = "select userType from userdetails where membershipId = '"
					+ membershipId + "'";
			rs = stmt.executeQuery(query);
			if(rs.next()){
				userType = rs.getString("userType");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			connectionPool.free(con);
		}
		return userType;
	}
	
	public Customer[] getUserDetails(String userType)
	{
		ResultSet rs;
		String query;
		String countQuery;
		int Count = 0;
		int index=0;
		Customer[] customerList = null;
				
		try {
				query = "select * from userdetails where userType = '" + userType + "'";
				countQuery = "select count(1) from userdetails where userType = '" + userType + "'";
				
				rs = stmt.executeQuery(countQuery);
				if (rs.next()) {
					 Count = rs.getInt(1);
				}
				
				customerList = new Customer[Count];
				
				rs = stmt.executeQuery(query);
				
				while (rs.next()) {
					Customer customer = new Customer();
					customer.setAddress(rs.getString("address"));
					customer.setCity(rs.getString("city"));
					customer.setDateOfBirth(rs.getString("dateOfBirth"));
					customer.setEmailId(rs.getString("emailId"));
					customer.setExpiryDate(rs.getString("expiryDate"));
					customer.setFirstName(rs.getString("firstName"));
					customer.setGender(rs.getString("gender"));
					customer.setLastName(rs.getString("lastName"));
					customer.setMembershipId(rs.getInt("membershipId"));
					customer.setPassword(rs.getString("password"));
					customer.setRegistrationDate(rs.getString("registrationDate"));
					customer.setState(rs.getString("state"));
					customer.setUserType(rs.getString("userType"));
					customer.setZipCode(rs.getInt("zipCode"));
					customerList[index] = customer;
					index++;
				}
			}
		 catch (SQLException e) {
			e.printStackTrace();
		}finally{
			connectionPool.free(con);
		}
		
		return customerList;
		
	}
	
	public boolean addUpdateUserDetails(int[] columnId, String[] userDetails, boolean isNewUser, String[] purchaseDetails) {

		// while creating a user please make sure that we are also inserting/updating respective entries in simple/premium user tables.
		
		// updation of the fields should take place depending upon the userDetails' id
		// 0- membershipId
		// 1- emailId
		// 2- password
		// 3- firstName
		// 4- lastName
		// 5- dateOfBirth
		// 6- address
		// 7- city
		// 8- state
		// 9- zipCode
		// 10- gender
		// 11- userType (simple/premium members)
		// 12- expiryDate
		// 13- registrationDate
		// 14- isActive
		 
		//extra params   ..purchaseDetails[]
		// 0- AmountPaid
		// 1- plan		...varchar(25)
		// 2- subscriptionId
		
		int rowcount = 0;
		int i, j;
		String[] columnName = {"membershipId","emailId","password","firstName","lastName","dateOfBirth","address","city","state","zipCode",
				"gender","userType","expiryDate","registrationDate","isActive"};
		ArrayList<String> intColumns = new ArrayList<String>(); 
		intColumns.add("zipCode");
		boolean isSuccess = false;
		
		int membershipId = Integer.parseInt(userDetails[0]);
		String userType = userDetails[11];
		String regisrationId = userDetails[13];
		int amountPaid = Integer.parseInt(purchaseDetails[0]);
		String plan = purchaseDetails[1];
		int subscriptionId = Integer.parseInt(purchaseDetails[2]);
		if(!isNewUser){
			if (isMember(membershipId)) {
				StringBuffer query = new StringBuffer();
				query.append("UPDATE userDetails SET ");
				for (j = 0; j < columnId.length - 1; j++) {
					if (intColumns.contains(columnName[j])) {
						query.append(columnName[columnId[j]] + " = "
								+ Integer.parseInt(userDetails[j]) + ",");
					} else {
						query.append(columnName[columnId[j]] + " = '"
								+ userDetails[j] + "',");
					}
				}
				if (intColumns.contains(columnName[j])) {
					query.append(columnName[columnId[j]] + " = " + userDetails[j] + "");
				} else {
					query.append(columnName[columnId[j]] + " = '" + userDetails[j] + "'");					
				}
				query.append(" where membershipId = '" + membershipId + "';");
				try {
					rowcount = stmt.executeUpdate(query.toString());
					if ((rowcount > 0)) {
						isSuccess = true;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {

			try {
				i=1;
				Customer customer = signIn(userDetails[i], null);
				if ((customer == null) && !isMember(membershipId) && (userDetails.length == columnId.length)) {
					
					StringBuffer query = new StringBuffer();
					query.append("Insert into userDetails ( ");
					for( j = 0; j < columnId.length - 1; j++){
							query.append( columnName[j] +", ");
					}
					query.append( columnName[j] +" ) values (");

					for (j = 0; j < userDetails.length - 1; j++) {
						if (intColumns.contains(columnName[j])) {
							query.append(Integer.parseInt(userDetails[j]) + ",");
						} else {
							query.append("'");
							query.append(userDetails[j] + "',");
						}
					}
					if (intColumns.contains(columnName[j])) {
						query.append( ""+userDetails[j] + ");");
					} else {
						query.append( "'"+userDetails[j] + "');");						
					}
					rowcount = stmt.executeUpdate(query.toString());
					if (rowcount > 0) {
						CallableStatement cs = con.prepareCall("{ call sp_Ins_transactionHistory(?,?,?,?,?,?,?); }");
	                       cs.setInt(1, membershipId);						//transactionId
	                       cs.setInt(2, amountPaid);						// amountPaid
	                       cs.setString(3, regisrationId);					// registrationDate
	                       cs.setInt(4, subscriptionId);					// subscriptionId
	                       cs.setString(5, userType);						// userType
	                       cs.setString(6, plan);							// plan
	                       cs.setInt(7, 0);									// numberOfMoviesIssued
	                       
	                       cs.executeQuery();
	                       isSuccess = true;
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				connectionPool.free(con);
			}
		}
		return isSuccess;
	}
	
	public boolean addUpdateMoviesDetails(int[] columnId,
			String[] movieDetails, int movieId) {
		
		// updation of the fields should take place depending upon the movieDetails' id
		// 0- movieName
		// 1- movieDesc
		// 2- releaseDate
		// 3- movieCategoryId
		// 4- movieBanner
		// 5- availableCopies
		// 6- movieRating
		// 7- movieRent
		// 8- movieHits
		// 9- isActive
		
		int rowcount = 0;
		int i, j;
		String[] columnName = {"movieName","movieDesc","releaseDate","movieCategoryId","movieBanner","availableCopies","movieRating","movieRent","movieHits",
				"isActive"};
		ArrayList<String> intColumns = new ArrayList<String>(); 
		
		intColumns.add("movieId");
		intColumns.add("movieCategoryId");
		intColumns.add("availableCopies");
		intColumns.add("movieRating");
		intColumns.add("movieRent");
		intColumns.add("movieHits");
		
		boolean isSuccess = false;
		
		if(movieId != 0){
			//if (isMember(membershipId)) {
				StringBuffer query = new StringBuffer();
				query.append("UPDATE movie SET ");
				for (j = 0; j < columnId.length - 1; j++) {
					if (intColumns.contains(columnName[j])) {
						query.append(columnName[columnId[j]] + " = "
								+ Integer.parseInt(movieDetails[j]) + ",");
					} else {
						query.append(columnName[columnId[j]] + " = '"
								+ movieDetails[j] + "',");
					}
				}
				if (intColumns.contains(columnName[j])) {
					query.append(columnName[columnId[j]] + " = " + Integer.parseInt(movieDetails[j]) + "");
				} else {
					query.append(columnName[columnId[j]] + " = '" + movieDetails[j] + "'");					
				}
				query.append(" where movieId = '" + movieId + "';");
				try {
					rowcount = stmt.executeUpdate(query.toString());
					if ((rowcount > 0)) {
						isSuccess = true;
					}
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			//}
		} else {

			try {
				i=1;
				boolean isMoviePresent = isMovie(movieId);
				
				if(!isMoviePresent){
					
					StringBuffer query = new StringBuffer();
					query.append("Insert into movie ( ");
					for( j = 0; j < columnId.length - 1; j++){
							query.append( columnName[j] +", ");
					}
					query.append( columnName[j] +" ) values (");

					for (j = 0; j < movieDetails.length - 1; j++) {
						if (intColumns.contains(columnName[j])) {
							query.append(Integer.parseInt(movieDetails[j]) + ",");
						} else {
							query.append("'");
							query.append(movieDetails[j] + "',");
						}
					}
					if (intColumns.contains(columnName[j])) {
						query.append( "" + Integer.parseInt(movieDetails[j]) + ");");
					} else {
						query.append( "'"+movieDetails[j] + "');");						
					}
					rowcount = stmt.executeUpdate(query.toString());
					if (rowcount > 0) {
						isSuccess = true;
					}
					
				}
									
				
				}
			catch (SQLException e) {
				
				e.printStackTrace();
			}finally{
				connectionPool.free(con);
			}
		}
		return isSuccess;
		
	}
	
	public boolean isMovieNamePresent(String movieName){
		DatabaseConnection db = new DatabaseConnection();
				
		ResultSet rs;
		String query;
		try {
				query = "select count(*) from movie where movieName = "
						+ movieName + ";";
			
			rs = db.stmt.executeQuery(query);
			if (rs.next()){
				return true;
			}  
		} catch (SQLException e) {
			e.printStackTrace();
		}	finally{
			connectionPool.free(con);
		}	
		return false;
	}
	
	public Movie getMovieDetails(int movieId) {
		Movie movie = null;
		try {
			String countQuery, query;
			query = "select * from movie m, movieCategory mc where m.movieCategoryId = mc.movieCategoryId and m.isActive='T' and m.movieId = "
					+ movieId + ";";
			ResultSet rs;

			rs = stmt.executeQuery(query);

			rs.next();

			movie = new Movie();
			movie.setMovieId(rs.getInt("movieId"));
			movie.setMovieName(rs.getString("movieName"));
			movie.setMovieDescription(rs.getString("movieDesc"));
			movie.setReleaseDate(rs.getString("releaseDate"));
			movie.setMovieCategoryName(rs.getString("movieCategoryName"));
			movie.setMovieCategoryId(rs.getInt("movieCategoryId"));
			movie.setMovieBanner(rs.getString("movieBanner"));
			movie.setAvailableCopies(rs.getInt("availableCopies"));
			movie.setMovieRating(rs.getInt("movieRating"));
			movie.setMovieRent(rs.getInt("movieRent"));
			movie.setMovieHits(rs.getInt("movieHits"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			connectionPool.free(con);
		}
		return movie;
	}
	
	public AccountDetails getAccountDetails(int membershipId) {
		String userType = getUserType(membershipId);
		MovieAccountDetail[] movieAccountDetail;
		AccountDetails accountDetails = new AccountDetails();
		int noOfMoviesIssued = 0;
		String plan = "";
		String countQuery,query;
		String queryMoviesIssued;
		int i,count;
		if ("S".equals(userType)) {
			queryMoviesIssued = "select numberOfMoviesIssued from simplecustomer where membershipId = '"
					+ membershipId + "';";
			try {
				rs = stmt.executeQuery(queryMoviesIssued);

				if (rs.next()) {
					noOfMoviesIssued = rs.getInt(1);
					countQuery = "select count(1) from rentaltransactions r,movie m where m.movieId=r.movieId and r.membershipId = "
							+ membershipId + " and r.isActive = 'T'";
					query = "select r.movieId,m.movieName,r.issueDate,r.dueDate,r.actualReturnDate,r.fineAmount from rentaltransactions r,movie m where m.movieId=r.movieId and r.membershipId = "
							+ membershipId + " and r.isActive = 'T'";
					rs = stmt.executeQuery(query);
					if (rs.next()) {
						count = rs.getInt(1);
						rs = stmt.executeQuery(query);
						movieAccountDetail = new MovieAccountDetail[count];
						i = 0;
						while (rs.next()) {
							movieAccountDetail[i].setMovieId(rs
									.getInt("movieId"));
							movieAccountDetail[i].setMovieName(rs
									.getString("movieName"));
							movieAccountDetail[i].setIssueDate(rs
									.getString("issueDate"));
							movieAccountDetail[i].setDueDate(rs
									.getString("dueDate"));
							movieAccountDetail[i].setFineAmount(rs
									.getInt("fineAmount"));
							i++;
						}
						accountDetails.setMovieAccountDetail(movieAccountDetail);
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			queryMoviesIssued = "select numberOfMoviesIssued,plan from premiumcustomer where membershipId = '"
					+ membershipId + "';";
			try {
				rs = stmt.executeQuery(queryMoviesIssued);
				if (rs.next()) {
					noOfMoviesIssued = rs.getInt("numberOfMoviesIssued");
					plan = rs.getString("plan");
					countQuery = "select count(1) from rentaltransactions r,movie m where m.movieId=r.movieId and r.membershipId = "
							+ membershipId + " and r.isActive = 'T';";
					query = "select r.movieId,m.movieName,r.issueDate,r.dueDate,r.actualReturnDate,r.fineAmount from rentaltransactions r,movie m where m.movieId=r.movieId and r.membershipId = "
							+ membershipId + " and r.isActive = 'T';";
					rs = stmt.executeQuery(countQuery);
					if (rs.next()) {
						count = rs.getInt(1);
						rs = stmt.executeQuery(query);
						movieAccountDetail = new MovieAccountDetail[count];
						i = 0;
						while (rs.next()) {
							MovieAccountDetail movieDetail = new MovieAccountDetail();
							movieDetail.setMovieId(rs.getInt("movieId"));
							movieDetail.setMovieName(rs.getString("movieName"));
							movieDetail.setIssueDate(rs.getString("issueDate"));
							movieDetail.setDueDate(rs.getString("dueDate"));
							movieDetail.setFineAmount(rs.getInt("fineAmount"));
							movieAccountDetail[i] = movieDetail;
							i++;
						}
						accountDetails
								.setMovieAccountDetail(movieAccountDetail);
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				connectionPool.free(con);
			}
		}
		if(noOfMoviesIssued<0){
			noOfMoviesIssued=0;
		}
		accountDetails.setNoOfMovies(noOfMoviesIssued);
		accountDetails.setPlan(plan);		
		
		return accountDetails;
	}
	
	/*public static void main(String[] args){
		DatabaseConnection dbConn = new DatabaseConnection();
		int[] columnId = {0,1,2,3,4,5,6,7,8,9,10 };
		String[] userDetails = {"abc@gmail.com","pwd","abhinav","patil","addr1","city1","state1","95112","M","S","T" };
		
		dbConn.addUpdateUserDetails(columnId, userDetails, 0);
	}*/
}
