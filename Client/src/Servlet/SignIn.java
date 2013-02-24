package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import VideoLibrary.ServiceProxy;
import entity.Customer;
import entity.Movie;
import entity.MovieCategory;

/**
 * Servlet implementation class SignIn
 */
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new ServiceProxy();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignIn() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] user_details = new String[2];

		PrintWriter out = response.getWriter();
		VideoLibrary.ServiceProxy proxy = new VideoLibrary.ServiceProxy();
		response.setContentType("text/html");

		try {

			user_details[0] = request.getParameter("email"); // Email.
			user_details[1] = request.getParameter("password"); // Password.
			proxy.setEndpoint("http://localhost:8080/VideoLibraryMgmt/services/Service");
			Customer customer = proxy.signIn(user_details[0], user_details[1]);
			HttpSession session = request.getSession(false);
			System.out.println(customer.getFirstName());
			
			if (customer == null) {
				if (session != null) {
					session.invalidate();
					
					response.sendRedirect("login.jsp");
				}
			}

			else {
				
				MovieCategory[] movieCategory = proxy.getMovieCategoryList();
				Movie[] movieSpecial = proxy.searchMovies(4,"",0, 1);
				Movie[] movieHeader = proxy.searchMovies(4,"",0,1);
				Movie[] movieLatest = proxy.searchMovies(4,"",0,6);
				Movie[] movieRecommended = proxy.searchMovies(5,"",0, 3);
			request.setAttribute("category", movieCategory);
			request.setAttribute("movieLatest", movieLatest);
			request.setAttribute("movieRecommended", movieRecommended);
			request.setAttribute("movieSpecial", movieSpecial);
			request.setAttribute("movieHeader", movieHeader);
			
				session.setAttribute("userSession", customer);
				RequestDispatcher reqDispatcher = request.getRequestDispatcher("index.jsp");
				reqDispatcher.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
