package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Movie;

/**
 * Servlet implementation class Remove
 */
public class Remove extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Remove() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		VideoLibrary.ServiceProxy proxy = new VideoLibrary.ServiceProxy();
		try{
		HttpSession session = request.getSession(false);
		ArrayList<Movie> cartDetails = ((ArrayList<Movie>)(session.getAttribute("cartDetails")));
		for(Movie movie: cartDetails)
		{
			if(movie.getMovieId() == Integer.parseInt(request.getParameter("movieId")))
			{
				cartDetails.remove(movie);
				session.setAttribute("cartDetails", cartDetails);
				session.setAttribute("cartTotalItems", cartDetails.size());
				int totalAmt = Integer.parseInt(session.getAttribute("cartTotal").toString()) - movie.getMovieRent();
				
				session.setAttribute("cartTotal", totalAmt);
				break;
			}
		}
		response.sendRedirect("indexRequest.jsp");
		//RequestDispatcher reqDispatcher = request.getRequestDispatcher("indexRequest.jsp");
		//reqDispatcher.forward(request, response);
		}catch (Exception e) {
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
