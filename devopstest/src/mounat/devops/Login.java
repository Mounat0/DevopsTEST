import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {

       


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//get request parameters for userID and password
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		
		//get servlet config init params
		String userID = getServletConfig().getInitParameter("user");
		String password = getServletConfig().getInitParameter("password");
		//logging example
		log("User="+user+"::password="+pwd);
		
		if(userID.equals(user) && password.equals(pwd)){
			response.sendRedirect("index.jsp");
		}
		else if (userID.equals("a") && password.equals("a")){
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
		}
		else if (userID.equals("b") && password.equals("b")){
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
		}
		else if (userID.equals("c") && password.equals("c")){
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
		}
		else if (userID.equals("d") && password.equals("d")){
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
		}
		else{
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
			PrintWriter out= response.getWriter();
			out.println("<font color=red>Either user name or password is wrong.</font>");
			rd.include(request, response);
			
		}
		
	}
}