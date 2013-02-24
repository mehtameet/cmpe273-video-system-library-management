package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Customer;
import entity.Movie;
import entity.MovieCategory;

import VideoLibrary.ServiceProxy;

/**
 * Servlet implementation class MovieList
 */
public class MovieList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new ServiceProxy();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieList() {
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
		VideoLibrary.ServiceProxy proxy = new VideoLibrary.ServiceProxy();
		HttpSession session = request.getSession(false);
/*		Integer searchBy;
		String searchValue;
		if(request.getParameter("searchType") == null && request.getParameter("searchValue") == null){
			searchBy = (Integer)session.getAttribute("searchType");
			searchValue = (String)session.getAttribute("searchValue");
		} else {
		searchBy = Integer.parseInt(request.getParameter("searchType"));
		searchValue = request.getParameter("searchValue");
		}*/
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
	}

}
