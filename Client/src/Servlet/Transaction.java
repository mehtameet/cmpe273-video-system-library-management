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

import com.sun.org.apache.bcel.internal.generic.DADD;

import entity.Customer;
import entity.Movie;

/**
 * Servlet implementation class transaction
 */
public class Transaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transaction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doget of transaction");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		VideoLibrary.ServiceProxy proxy = new VideoLibrary.ServiceProxy();
		try{
		HttpSession session = request.getSession(false);
		boolean result;
		Date curDate = new Date();
		Date dueDate = new Date();
		dueDate.setTime(curDate.getTime() + 7 * 24 * 60 * 60 * 1000);
		String currdate = curDate.toString();
		String duedate = dueDate.toString();
		int[] columnId = {0};
		String[] movieDetails = new String[6];
		movieDetails[0] = Integer.toString(((Customer)session.getAttribute("userSession")).getMembershipId());
		movieDetails[1] = currdate;
		movieDetails[2] = duedate;
		movieDetails[3] = ""; 
		movieDetails[4] = "0";
		movieDetails[5] = "T";
		
		/*String[] movieDetails = {"123123","2011-10-12 12:40:38","2011-11-12 12:40:38","","0","T"};
		int[] movieIds = {3,4,5};*/
		
		int i = 0;
		ArrayList<Movie> cartDetails = ((ArrayList<Movie>)(session.getAttribute("cartDetails")));

		int [] movieIds = new int[cartDetails.size()];
		for(Movie movie: cartDetails)
		{
			movieIds[i] = movie.getMovieId();
			 i++;
		}
		int amountPaid = Integer.parseInt(session.getAttribute("cartTotal").toString());
		String transactionDate = currdate;
		proxy.setEndpoint("http://localhost:8080/VideoLibraryMgmt/services/Service");
		result = proxy.issueMovies(columnId, movieDetails, movieIds, amountPaid, transactionDate);
		if (result == true) {
			RequestDispatcher reqDispatcher = request.getRequestDispatcher("receiptRequest.jsp?page=4");
			reqDispatcher.forward(request, response);
		} else {
			RequestDispatcher reqDispatcher = request.getRequestDispatcher("checkout.jsp");
			reqDispatcher.forward(request, response);
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
