package in.add;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("aaa")
public class Adition extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int i=Integer.parseInt(req.getParameter("no1"));
		int j=Integer.parseInt(req.getParameter("no2"));
		
		int c=i+j;
		
		PrintWriter objPrintWriter=res.getWriter();
		
		objPrintWriter.print(c);
		
		
	}	

}
