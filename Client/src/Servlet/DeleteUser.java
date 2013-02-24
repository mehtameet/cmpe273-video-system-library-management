package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import VideoLibrary.ServiceProxy;

/**
 * Servlet implementation class DeleteUser
 */
public class DeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new ServiceProxy();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUser() {
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
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		boolean qdone;
		try {
			int[] userId = new int[1];

			userId[0] = Integer.parseInt(request.getParameter("UserID")); // UserID.

			proxy.setEndpoint("http://localhost:8080/VideoLibraryMgmt/services/Service");
			qdone = proxy.deleteUser(userId);
			if (qdone == true) {
				response.sendRedirect("Navigate to the page where it will navigate when the user is deleted. login.jsp?flag=1");
			} else {
				out.println("\n <a href='signup.jsp?flag=0'>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
