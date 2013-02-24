package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Customer;
import entity.MovieCategory;

/**
 * Servlet implementation class CustomerList
 */
public class CustomerList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		VideoLibrary.ServiceProxy proxy = new VideoLibrary.ServiceProxy();
		response.setContentType("text/html");
		String type = request.getParameter("type");
		try {
			proxy.setEndpoint("http://localhost:8080/VideoLibraryMgmt/services/Service");
			Customer[] customer = proxy.getUserDetails(type);
			
			if (customer == null) {
					response.sendRedirect("index.jsp");
				}
			
			else {
				request.setAttribute("CustList", customer);
				RequestDispatcher reqDispatcher;
				if(type.equals("S"))
					reqDispatcher = request.getRequestDispatcher("admin/regularCustRequest.jsp");
				else
					reqDispatcher = request.getRequestDispatcher("admin/premiumCustRequest.jsp");
				reqDispatcher.forward(request, response);
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
