package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VideoLibrary.ServiceProxy;

/**
 * Servlet implementation class GetMovies
 */

// THIS SERVLET IS CREATED FOR DISPLAYING ALL THE MOVIES AVAILABLE. IT GIVES THE LIST OF ALL THE MOVIES TO THE ADMIN/USER.

public class SearchMovies extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new ServiceProxy();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchMovies() {
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
		
	response.setContentType("text/html");
	String qdone[];		 
    try
    {					 	
    	String Movie_Search_By; // This field will save the category by which movies will be searched.
		int movie_equivalent; // This field will save assign an ID for the category.(This is created for the service.java)
		
		Movie_Search_By = request.getParameter("DROPBOX From which the category will be selected in the JSP PAGE."); 
		
		if(Movie_Search_By.equals("Active Movies.")) // This shows the movies which are active.
			movie_equivalent = 0;
		
		else if(Movie_Search_By.equals("Movies Name.")) // This shows the movies according to the Movie Name.
			movie_equivalent = 1;
			
		else if(Movie_Search_By.equals("Movies Category.")) // This shows the movies according to the Movie Category.
			movie_equivalent = 2;
		
		else
			movie_equivalent = 3;
		
    	proxy.setEndpoint("http://localhost:8080/VideoLibraryMgmt/services/Service");
		qdone = proxy.searchMovies(movie_equivalent,Movie_Search_By);
		//HttpSession session = request.getSession();
		String movie_display[][] = new String[qdone.length][10];
		for (int i=0;i<qdone.length;i++)
		{
			movie_display[i] = qdone[i].split("\\|");
			System.out.println(movie_display[i]);
		}
		
		request.setAttribute("MovieData", movie_display);
		RequestDispatcher dispatcher = request.getRequestDispatcher("GetMovies.jsp");
		dispatcher.forward(request, response);				
	}catch(Exception e){
       e.printStackTrace();
      }// End of Catch.
    
   }// End of doPost.
    

}
