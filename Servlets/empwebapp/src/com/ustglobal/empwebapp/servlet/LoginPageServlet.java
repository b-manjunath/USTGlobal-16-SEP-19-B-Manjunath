package com.ustglobal.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login.jsp")
public class LoginPageServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		
		String id = "";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("alwaysremember"))
				{
					id = cookie.getValue();
				}
			}
		}
		out.println("<html>");
		out.println("<fieldset align='center'>");
		out.println("<legend>Login</legend>");
		out.println("<form action='./login' method='post'>");
		out.println("<table align='center'>");
		out.println("<tr><td>Id:</td>");
		out.println("<td><input type='number' name='id' value ='"+id+"'></td></tr>");
		out.println("<tr><td>Password:</td>");
		out.println("<td><input type='password' name='password'></td></tr>");
		out.println("<tr><td><input type='checkbox' name='rememberme' value = 'rememberme'>Remember me</td></tr>");	
		out.println("<tr><td><input type='reset' value='reset'></td><td><input type='submit' value='login'></td></tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</fieldset>");
		out.println("<a href='./register.html' class='float-left'>Register Here</a>");
		out.println("</html>");

		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	
	}
}
