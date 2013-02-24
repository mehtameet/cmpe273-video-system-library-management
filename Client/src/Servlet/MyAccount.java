package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.AccountDetails;
import entity.Customer;
import entity.Movie;
import entity.MovieCategory;

/**
 * Servlet implementation class MyAccount
 */
public class MyAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		VideoLibrary.ServiceProxy proxy = new VideoLibrary.ServiceProxy();
		try
		{
		HttpSession session = request.getSession(false);
		proxy.setEndpoint("http://localhost:8080/VideoLibraryMgmt/services/Service");
		MovieCategory[] movieCategory = proxy.getMovieCategoryList();
		Movie[] movieSpecial = proxy.searchMovies(4,"",0, 1);
		Movie[] movieHeader = proxy.searchMovies(4,"",0,1);
		request.setAttribute("category", movieCategory);
		request.setAttribute("movieSpecial", movieSpecial);
		request.setAttribute("movieHeader", movieHeader);
		int userId;
		if((Customer)session.getAttribute("userSession")!= null){
			userId = ((Customer)session.getAttribute("userSession")).getMembershipId();
			AccountDetails accountDetails = proxy.getAccountDetails(userId); 
			request.setAttribute("accountDetails", accountDetails);
		}
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("myAccountRequest.jsp");
		reqDispatcher.forward(request, response);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
