package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.mail.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Movie;
import entity.MovieCategory;

/**
 * Servlet implementation class AddtoCart
 */
public class AddtoCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddtoCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		VideoLibrary.ServiceProxy proxy = new VideoLibrary.ServiceProxy();
		response.setContentType("text/html");
		
		try {
			proxy.setEndpoint("http://localhost:8080/VideoLibraryMgmt/services/Service");
			MovieCategory[] movieCategory = proxy.getMovieCategoryList();
			Movie[] movieSpecial = proxy.searchMovies(4,"",0, 1);
			Movie[] movieHeader = proxy.searchMovies(4, "",0,1);
			
			Movie movieDetail = proxy.getMovieDetails(Integer.parseInt(request.getParameter("id")));
			ArrayList<Movie> movieCart;
			if(session.getAttribute("cartDetails") == null) {
			movieCart = new ArrayList<Movie>();
			} else {
			movieCart = (ArrayList<Movie>)(session.getAttribute("cartDetails"));
			}

			movieCart.add(movieDetail);
			session.setAttribute("cartDetails", movieCart);
			
			if (movieCategory == null) {
					response.sendRedirect("login.jsp");
				}
			
			else {
					request.setAttribute("category", movieCategory);
					request.setAttribute("movieSpecial", movieSpecial);
					request.setAttribute("movieHeader", movieHeader);
					if(session.getAttribute("userSession") == null)
					{
						RequestDispatcher reqDispatcher = request.getRequestDispatcher("loginRequest.jsp");
						reqDispatcher.forward(request, response);
					}else
					{
					RequestDispatcher reqDispatcher = request.getRequestDispatcher("addtocartRequest.jsp");
					reqDispatcher.forward(request, response);
					}
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
