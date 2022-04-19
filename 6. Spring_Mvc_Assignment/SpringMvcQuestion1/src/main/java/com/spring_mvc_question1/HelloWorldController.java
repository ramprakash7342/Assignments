package com.spring_mvc_question1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@WebServlet(urlPatterns = "/login")
public class HelloWorldController extends HttpServlet {


	 protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			  throws ServletException, IOException{
		 
		request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
		
	  }

	  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			  throws ServletException, IOException{
		
		request.getRequestDispatcher("/WEB-INF/views/helloWorld.jsp").forward(request, response);
		
	  }
	
}

