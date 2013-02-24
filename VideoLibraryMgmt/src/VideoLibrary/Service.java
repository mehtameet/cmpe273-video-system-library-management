package VideoLibrary;

import java.sql.ResultSet;
import java.sql.Statement;

import javax.jws.WebService;

import entity.AccountDetails;
import entity.Customer;
import entity.Movie;
import entity.MovieCategory;
import exception.MalformedException;

@WebService
public class Service implements ServiceInterface {
	DatabaseConnection db = new DatabaseConnection();
	Statement stmt = null;
	//TODO: Need to remove the comments written in between the 
	// functions before submitting the file on Thursday. 

	public Customer signIn(String email, String password) {
		// if userId returned is '0' then the user does not exist in the database.
		// if the userId is a nonZero value then the user is present in the database.
		
		// normal sign in method
		Customer customer = db.signIn(email, password);
		return customer;
	}

	public boolean addUpdateUserDetails(int[] columnId, String[] userDetails, boolean isNewUser, String[] purchaseDetails) throws MalformedException{
		// NEW USER: userId == 0 
		// UPDATE USER DETAILS: userId should be retrieved in the servlet from the session and call the service.
		
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
		
		//extra params
		// 0- AmountPaid
		// 1- plan		...varchar(25)
		// 2- subscriptionId
		
		boolean isSuccess = false;
		String[] columnName = { "membershipId", "emailId", "password",
				"firstName", "lastName", "dateOfBirth", "address", "city",
				"state", "zipCode", "gender", "userType", "expiryDate",
				"registrationDate", "isActive" };
		ValidateInput validateInput = new ValidateInput();

		// zipcode, membershipId, state, phone
		/*	if ((validateInput.validateMemberShipId(userDetails[0]))
					&& (validateInput.validateState(userDetails[8]))
					&& (validateInput.validateZipCode(userDetails[9]))) {*/
				isSuccess = db.addUpdateUserDetails(columnId, userDetails,
						isNewUser, purchaseDetails);
			/*}*/
		
		return isSuccess;
	}
	
	public Customer[] searchUsers(int searchBy, String searchValue, int lowerLimit, int upperLimit, String userType) {
		/* String [] fieldName = {"firstName","lastName"};
		 * String query = "select * from tableName where '"+ fieldName[searchBy] + "' = '"+ searchValue + "'";
		 */
		
		// 0- get all users which have activeUser = 'T'.. searchValue should be passed as NULL in this case.
		// 1- First Name
		// 2- Last Name
		// 3- Address
		// 4- City
		// 5- State
		// 6- Zip Code
		
		// 7- userType (simple/premium members)	
		
		Customer[] custList = db.searchUsers(searchBy, searchValue, lowerLimit, upperLimit, userType);
		return custList;
	}
	
	public boolean deleteUser(int[] userId) {
		// do not delete the respective entries from simple and premium customers .. do nothing in those tables.
		// instead of deleting users from the table ..set the activeUsers flag to 'F'.
	
		boolean isDeleted = db.deleteUser(userId);
		
		return isDeleted;
	}

	public boolean issueMovies(int[] columnId, String[] movieDetails, int[] movieIds, int amountPaid, String transactionDate) {
		
		boolean isSuccess = db.issueMovies(columnId, movieDetails, movieIds, amountPaid, transactionDate);
		return isSuccess;
	}
	
	public Movie[] searchMovies(int searchBy, String searchValue, int lowerLimit, int upperLimit) {
		// 0- FULL SEARCH ... get all movies which have activeMovies = 'T' .. searchValue should be passed as NULL in this case.
		// upper and lower limit will be according to the client's preference
		
		//// typical search
		// 1- movieName
		// 2- movieCategoryId
		// 3- bannerName
		
		//// special queries: ORDER BY releaseDate/rating...searchValue == will be blank  
		// 4- releaseDate
		// 5- rating
		
		Movie[] movieList = db.searchMovies(searchBy, searchValue, lowerLimit, upperLimit);
		return movieList;
	}
	
	public boolean deleteMovies(int[] movieIds) {
		// for admin only.. he shud be able to delete more than one movies at a time and hence int[].
		// instead of deleting movies from the table ..set the activeMovies flag to 'F'.
		boolean isvalid = false;
		isvalid = db.deleteMovies(movieIds);
		
		return isvalid;
	}
	
/*	public boolean issueMovies(int userId, int[] movieIds) {
		// if the user is inserting more than one movies then iterate over the insert operation depending upon the number of movies.  
		boolean isIssued =false;
		return isIssued;
	}*/
	
	public boolean returnMovies(int userId, int[] movieIds) {
		// fetching the transactionId on the basis of userId and movieId (please iterate over the array) and close the transaction!
		// by closing the transaction change status of activeTransaction to F
		boolean bln = db.returnMovies(userId, movieIds);
		return bln;
	}
	
	public Customer[] getUserDetails(String userType){
		// this function wud be available for admin users only.
		// dont forget to access the simple/premium customer table for issued movie details.
		
		return db.getUserDetails(userType);
	}
	
	public Movie getMovieDetails(int movieId){
		// for admin
		Movie movieDetail = db.getMovieDetails(movieId);
		return movieDetail;
	}
	
	public String[] getUsersByMovieId(int movieId){
		// for admin.
		// get users by movie Id. Return String[] userId or see if u can return an object.

		String[] userIds = new String[100];
		return userIds;
	}

	public MovieCategory[] getMovieCategoryList() {
// return MovieCategoryList from MovieCategory table
		return db.getMovieCategoryList();
	}

	@Override
	public boolean addUpdateMoviesDetails(int[] columnId,
			String[] movieDetails, int movieId) {
		// NEW USER: movieId == 0 
		// UPDATE USER DETAILS: movieId should be retrieved in the servlet from the session and call the service.
		
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
		
		boolean isSuccess = db.addUpdateMoviesDetails(columnId, movieDetails, movieId);
	return isSuccess;	
	}
	
	public AccountDetails getAccountDetails(int membershipId){
		AccountDetails accountDetails = db.getAccountDetails(membershipId);
		return accountDetails;
	}
	
	public static void main(String[] args){
		Service service = new Service();
		int[] columnId = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14 };
		String[] userDetails = {"3232","abhinavp32@gmail.com","pwd32","","firoz32","3232","sanJose32","city32","state32","95332","M","S","323232","5454","T"};
		//int[] columnId = {1,2,3,4};sam10
		//String[] userDetails = {"pwd4","sam","firoz","444" };
		Customer customer = service.signIn("abc@gmail.com", "pwd");
		//System.out.println("Sign in: "+customer.getEmailId());
		String[] purchaseDetails = {"532","tytyty","932"};
		boolean isNewUser = true;
		boolean isSuccess = false;
		try {
			isSuccess = service.addUpdateUserDetails(columnId, userDetails, isNewUser, purchaseDetails);
		} catch (MalformedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sign up is : "+isSuccess);
		customer = service.signIn("abc3@gmail.com", "pwd");
		//System.out.println("Sign in: "+customer.getFirstName());
		
		Movie[] movie = service.searchMovies(1, "movie",1,2);
		System.out.println("Movie Description: "+movie[0].getMovieDescription());
		
		Movie movieDetail = service.getMovieDetails(2);
	}
}
