package spring_mvc_question2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class SimpleInterestController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			  throws ServletException, IOException{
		 
		request.getRequestDispatcher("/WEB-INF/views/simpleInterest.jsp").forward(request, response);
		
	  }
   
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			  throws ServletException, IOException{
		
		  String amount= request.getParameter("amount");
		  String rate= request.getParameter("rate");
		  String years= request.getParameter("years");
		  int n1=Integer.parseInt(amount);
		  int n2=Integer.parseInt(rate);
		  int n3=Integer.parseInt(years);
		  double si=((n1*n2*n3)/100);
		  request.setAttribute("si", si);
		  request.getRequestDispatcher("/WEB-INF/views/simpleInterestResult.jsp").forward(request, response);
		
	  }
}
