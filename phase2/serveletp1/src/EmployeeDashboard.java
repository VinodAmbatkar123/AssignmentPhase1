

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeDashboard
 */
@WebServlet("/EmployeeDashboard")
public class EmployeeDashboard extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("hello world");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		out.println("Welcome"+request.getParameter("user")+"<br>");
		out.println("<form action='Employeefetch' method= 'post'>");
		out.println("<input type ='hidden' name='userword' value='"+request.getParameter("user")+"'>");
		out.println("<input type ='hidden' name='password' value='"+request.getParameter("password")+"'>");
		out.println("<input type ='submit' value='submit'>");
		out.println("</form>");
	}

}
