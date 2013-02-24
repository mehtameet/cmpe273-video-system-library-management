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
 * Servlet implementation class AdminSearchUser
 */
public class AdminSearchUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminSearchUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			VideoLibrary.ServiceProxy proxy = new VideoLibrary.ServiceProxy();
			HttpSession session = request.getSession(false);
			Integer searchBy;
			String searchValue;
			if(request.getParameter("searchType") == null && request.getParameter("searchValue") == null){
				searchBy = (Integer)session.getAttribute("searchType");
				searchValue = (String)session.getAttribute("searchValue");
			} else {
			searchBy = Integer.parseInt(request.getParameter("searchType"));
			searchValue = request.getParameter("searchValue");
			}
			Integer pageNo;
			if (request.getParameter("page") != null) {
				pageNo = Integer.parseInt(request.getParameter("page"));
			} else {
				pageNo = 1;
			}
			int upperLimit =  15;
			int lowerLimit;
			if (pageNo > 1) {
				lowerLimit = (pageNo - 1) * 15;
			} else {
				lowerLimit = 0;
			}
			try {
				Customer[] custList = null;//proxy.searchUsers(searchBy, searchValue,
						//lowerLimit, upperLimit,"P");
				session.setAttribute("searchType", searchBy);
				session.setAttribute("searchValue", searchValue);
				custList  = proxy.searchUsers(searchBy, searchValue, lowerLimit, upperLimit, request.getParameter("user"));				
				request.setAttribute("searchUsers", custList);				
				//response.sendRedirect("searchUser.jsp?user="+request.getParameter("user"));
				RequestDispatcher reqDispatcher = request.getRequestDispatcher("searchUser.jsp?user=request.getParameter('user')");
				reqDispatcher.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	

}
