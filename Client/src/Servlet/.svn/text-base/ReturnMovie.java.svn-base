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
 * Servlet implementation class ReturnMovie
 */
public class ReturnMovie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReturnMovie() {
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
		boolean res=false;
		int userId = 0;
		HttpSession session = request.getSession(false);
		proxy.setEndpoint("http://localhost:8080/VideoLibraryMgmt/services/Service");
		MovieCategory[] movieCategory = proxy.getMovieCategoryList();
		Movie[] movieSpecial = proxy.searchMovies(4,"",0, 1);
		Movie[] movieHeader = proxy.searchMovies(4,"",0,1);
		request.setAttribute("category", movieCategory);
		request.setAttribute("movieSpecial", movieSpecial);
		request.setAttribute("movieHeader", movieHeader);
		
		
		if((Customer)session.getAttribute("userSession")!= null){
			userId = ((Customer)session.getAttribute("userSession")).getMembershipId(); 
				
		}
		int[] movieIds = new int[1];
		movieIds[0] = Integer.parseInt(request.getParameter("movieId"));
		
		res = proxy.returnMovies(userId, movieIds);
		if(res == true)
		{
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("myAccount.jsp");
		reqDispatcher.forward(request, response);
		}
		else{
			RequestDispatcher reqDispatcher = request.getRequestDispatcher("indexRequest.jsp");
			reqDispatcher.forward(request, response);
				
		}
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
		doPost(request, response);
	}

}
