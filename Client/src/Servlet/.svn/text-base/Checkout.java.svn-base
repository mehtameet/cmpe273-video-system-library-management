package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Movie;
import entity.MovieCategory;

/**
 * Servlet implementation class Checkout
 */
public class Checkout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Checkout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		VideoLibrary.ServiceProxy proxy = new VideoLibrary.ServiceProxy();
		response.setContentType("text/html");
		
		try {
			proxy.setEndpoint("http://localhost:8080/VideoLibraryMgmt/services/Service");
			MovieCategory[] movieCategory = proxy.getMovieCategoryList();
			Movie[] movieSpecial = proxy.searchMovies(4,"",0, 1);
			Movie[] movieHeader = proxy.searchMovies(4,"",0,1);
			if (movieCategory == null) {
					response.sendRedirect("login.jsp");
				}
			
			else {
					request.setAttribute("category", movieCategory);
					request.setAttribute("movieSpecial", movieSpecial);
					request.setAttribute("movieHeader", movieHeader);
					RequestDispatcher reqDispatcher = request.getRequestDispatcher("checkoutRequest.jsp");
					reqDispatcher.forward(request, response);
			}
		} catch (Exception e) {
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
