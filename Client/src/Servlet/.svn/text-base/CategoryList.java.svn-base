package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Customer;
import entity.Movie;
import entity.MovieCategory;

/**
 * Servlet implementation class categoryList
 */
public class CategoryList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

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
				if(request.getParameter("page").equals("1"))
				{
					Movie[] movieLatest = proxy.searchMovies(4,"",0,6);
					Movie[] movieRecommended = proxy.searchMovies(5,"",0, 3);
				request.setAttribute("category", movieCategory);
				request.setAttribute("movieLatest", movieLatest);
				request.setAttribute("movieRecommended", movieRecommended);
				request.setAttribute("movieSpecial", movieSpecial);
				request.setAttribute("movieHeader", movieHeader);
				RequestDispatcher reqDispatcher = request.getRequestDispatcher("index.jsp");
				reqDispatcher.forward(request, response);
				}
				else if(request.getParameter("page").equals("2"))
				{
					request.setAttribute("category", movieCategory);
					request.setAttribute("movieSpecial", movieSpecial);
					request.setAttribute("movieHeader", movieHeader);
					RequestDispatcher reqDispatcher = request.getRequestDispatcher("login.jsp");
					reqDispatcher.forward(request, response);
				}
				else if(request.getParameter("page").equals("3"))
				{
					request.setAttribute("category", movieCategory);
					request.setAttribute("movieSpecial", movieSpecial);
					request.setAttribute("movieHeader", movieHeader);
					RequestDispatcher reqDispatcher = request.getRequestDispatcher("signupRequest.jsp");
					reqDispatcher.forward(request, response);
				}
				else if(request.getParameter("page").equals("4"))
				{
					request.setAttribute("category", movieCategory);
					request.setAttribute("movieSpecial", movieSpecial);
					request.setAttribute("movieHeader", movieHeader);
					RequestDispatcher reqDispatcher = request.getRequestDispatcher("receipt.jsp");
					reqDispatcher.forward(request, response);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}

}
