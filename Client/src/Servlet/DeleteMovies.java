package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Movie;
import entity.MovieCategory;

import VideoLibrary.ServiceProxy;

/**
 * Servlet implementation class DeleteMovies
 */
public class DeleteMovies extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new ServiceProxy();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMovies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		boolean qdone;
		try {
			//movieId = Integer.parseInt(request.getParameter("Movie")); // MovieID.
			int[] movieId = new int[100];
			String [] movies = request.getParameterValues("movieId");
					
			for(int i=0;i<movies.length;i++)
				movieId[i] = Integer.parseInt(movies[i]);
						
			proxy.setEndpoint("http://localhost:8080/VideoLibraryMgmt/services/Service");
			qdone = proxy.deleteMovies(movieId);
			
			if (qdone == true) {
				
				Integer pageNo;
				if (request.getParameter("page") != null) {
					pageNo = Integer.parseInt(request.getParameter("page"));
				} else {
					pageNo = 1;
				}
				int upperLimit = pageNo * 15;
				int lowerLimit;
				if (pageNo > 1) {
					lowerLimit = (pageNo - 1) * 15;
				} else {
					lowerLimit = 0;
				}
				try {
					Movie[] movie = proxy.searchMovies(0, "",
							lowerLimit, upperLimit);
		/*			session.setAttribute("searchType", searchBy);
					session.setAttribute("searchValue", searchValue);*/
					request.setAttribute("searchResult", movie);
					MovieCategory[] movieCategory = proxy.getMovieCategoryList();
		/*			Movie[] movieSpecial = proxy.searchMovies(4, "", 0, 1);
					Movie[] movieHeader = proxy.searchMovies(4, "", 0, 1);*/
					request.setAttribute("category", movieCategory);
		/*			request.setAttribute("movieSpecial", movieSpecial);
					request.setAttribute("movieHeader", movieHeader);*/
					// response.sendRedirect("search.jsp");
					RequestDispatcher reqDispatcher = request.getRequestDispatcher("movieList.jsp");
					reqDispatcher.forward(request, response);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				//response.sendRedirect("Navigate to the page where it will navigate when the user is deleted. login.jsp?flag=1");
			} 
			
			else {
				out.println("\n <a href='signup.jsp?flag=0'>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
