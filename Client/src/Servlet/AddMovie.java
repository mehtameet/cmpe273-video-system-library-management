package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Customer;

/**
 * Servlet implementation class AddMovie
 */
public class AddMovie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMovie() {
        super();
        // TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		
		VideoLibrary.ServiceProxy proxy = new VideoLibrary.ServiceProxy();
		response.setContentType("text/html");
		boolean result= false;
		try {
			// 0- movieName
			// 1- movieDesc
			// 2- releaseDate
			// 3- movieCategoryId
			// 4- movieBanner
			// 5- availableCopies
			// 6- movieRating
			// 7- movieRent
			// 8- movieHit
			// 9- isActive
			
			String movieDetails[] = new String[10];
			movieDetails[0] = request.getParameter("movieName");
			movieDetails[1] = request.getParameter("movieDesc");
			movieDetails[2] = request.getParameter("releaseDate");
			movieDetails[3] = request.getParameter("category");
			movieDetails[4] = request.getParameter("banner");
			movieDetails[5] = request.getParameter("copies");
			movieDetails[6] = "1";
			movieDetails[7] = request.getParameter("rent");
			movieDetails[8] = "0";
			movieDetails[9] = "T";
			
			
			proxy.setEndpoint("http://localhost:8080/VideoLibraryMgmt/services/Service");
			int movieId=0;
			int[] columnId = {0,1,2,3,4,5,6,7,8,9};
			result = proxy.addUpdateMoviesDetails(columnId, movieDetails, movieId);
			
			
			if (result == false) {
					response.sendRedirect("index.jsp");
				}
			
			else {
				RequestDispatcher reqDispatcher;
				reqDispatcher = request.getRequestDispatcher("movieList.jsp");
				reqDispatcher.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
