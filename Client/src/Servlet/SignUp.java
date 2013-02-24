package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import VideoLibrary.ServiceProxy;
import exception.MalformedException;

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new ServiceProxy();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String message = "";
		boolean qdone = false;
		try {
			String[] user_details = new String[15];
			int[] columnId = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14 };
			boolean isNewUser = true;
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

			user_details[0] = request.getParameter("membershipId"); // Email.
			user_details[1] = request.getParameter("email"); // Email.
			user_details[2] = request.getParameter("password"); // password.
			user_details[3] = request.getParameter("fname"); // First Name.
			user_details[4] = request.getParameter("lname"); // Last Name
			user_details[5] = request.getParameter("dob"); // Birth Date.
			user_details[6] = request.getParameter("address"); // Address.
			user_details[7] = request.getParameter("city"); // City
			user_details[8] = request.getParameter("state"); // State
			user_details[9] = request.getParameter("zipcode"); // Zip Code.
			user_details[10] = request.getParameter("sex"); // Gender.
			user_details[11] = request.getParameter("userType"); // Member type.
			
			
			String userType = user_details[11];
			String purchaseDetails[] = new String[3];
			purchaseDetails[0] = "0";
			purchaseDetails[1] = "0";
			purchaseDetails[2] = "0";
			
			
			Date curDate = new Date();
			user_details[12] = curDate.toString();
			user_details[13] = "";
			if (userType.equals("P")) {
				curDate.setTime(curDate.getTime() + 183 * 24 * 60 * 60 * 1000);
				user_details[13] = curDate.toString();
						
				purchaseDetails[2] = request
						.getParameter("plan");
				String subscriptionId = purchaseDetails[2];
				if ("1".equals(subscriptionId)) {
					purchaseDetails[1] = "Monthly";
				} else if ("1".equals(subscriptionId)) {
					purchaseDetails[1] = "Quarterly";
				}
				if ("1".equals(subscriptionId)) {
					purchaseDetails[1] = "Half-Yearly";
				} else {
					purchaseDetails[1] = "Yearly";
				}
				purchaseDetails[0] = request.getParameter("rate");
				purchaseDetails[2] = request.getParameter("plan");
			}
			/*user_details[12] = request.getParameter("usertype"); // expiryDate
			user_details[13] = request.getParameter("usertype"); // registrationDate
			*/
			user_details[14] = "T"; // Status to show whether the user is Active or not. 

			
			boolean isSuccess = false;
			String[] columnName = { "membershipId", "emailId", "password",
					"firstName", "lastName", "dateOfBirth", "address", "city",
					"state", "zipCode", "gender", "userType", "expiryDate",
					"registrationDate", "isActive" };
			ValidateInput validateInput = new ValidateInput();
			try {
				// zipcode, membershipId, state, phone
				if ((validateInput.validateMemberShipId(user_details[0]))
						&& (validateInput.validateState(user_details[8]))
						&& (validateInput.validateZipCode(user_details[9]))) {
					
					String[] userId = user_details[0].split("\\-");
					user_details[0] = userId.toString();
					StringBuffer st= new StringBuffer();
					for(int i=0;i<userId.length;i++){
					st.append(userId[i]);
					}
					user_details[0] = st.toString();
					
					proxy.setEndpoint("http://localhost:8080/VideoLibraryMgmt/services/Service");
					qdone = proxy.addUpdateUserDetails(columnId, user_details,
							isNewUser, purchaseDetails);
				}
			} catch(MalformedException mex){
				System.out.println("message: "+mex.getMessage());
				message = mex.getMessage();
				qdone = false;
			} catch (Exception e) {
				e.getMessage();
				message = "Required Fields are not properly Entered";
			}
			HttpSession session = request.getSession();

			RequestDispatcher reqDispatcher;
			if (qdone == true) {
				message = "User has been addd successfully! ";
				session.setAttribute("message", message);
				session.setAttribute("userSession", session);
				response.sendRedirect("login.jsp?flag=1");
				reqDispatcher = request.getRequestDispatcher("login.jsp?flag=1");
				reqDispatcher.forward(request, response);
			} else {
				request.setAttribute("message", message);
				reqDispatcher = request.getRequestDispatcher("signup.jsp?flag=0");
				reqDispatcher.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
