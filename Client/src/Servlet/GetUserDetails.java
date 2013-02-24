package Servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VideoLibrary.ServiceProxy;

/**
 * Servlet implementation class GetUserDetails
 */
public class GetUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new ServiceProxy();
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetUserDetails() {
        super();
        // TODO Auto-generated constructor stub.
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub.
		
		response.setContentType("text/html");
		String qdone[];		 
	    try{					 	
	    	String user_category; // This field will save assign an ID for the category.(This is created for the service.java)
				    	
			user_category = request.getParameter("DROPBOX From which the category will be selected in the JSP PAGE.");
	    		
			proxy.setEndpoint("http://localhost:8080/VideoLibraryMgmt/services/Service");
			qdone = proxy.searchUsers(user_category);
			String user_display[][] = new String[qdone.length][10];
			for (int i=0;i<qdone.length;i++){
				user_display[i] = qdone[i].split("\\|");
				System.out.println(user_display[i]);
			}
			
			request.setAttribute("Userata", user_display);
			RequestDispatcher dispatcher = request.getRequestDispatcher("GetUsers.jsp");
			dispatcher.forward(request, response);				
		}
	    catch(Exception e){
	       e.printStackTrace();
	    }
	}
}
