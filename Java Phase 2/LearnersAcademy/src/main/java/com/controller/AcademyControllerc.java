package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Subjects;
import com.service.AcademyService;


/**
 * Servlet implementation class AcademyControllerc
 */
@WebServlet("/AcademyControllerc")
public class AcademyControllerc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcademyControllerc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		AcademyService as = new AcademyService();
		

		//view subjects
		List<Subjects> listOfSubjects = as.viewSubjects();
		Iterator<Subjects> ii = listOfSubjects.iterator();
		while(ii.hasNext()) {
			Subjects su = ii.next();
			pw.println("<div>");
			pw.println("<p>Subject ID is "+su.getSuid()+" Subject name is "+su.getSubname()+"</p>");
			pw.println("</div>");
		
		}	
			
		RequestDispatcher rs = request.getRequestDispatcher("subjectsHome.jsp");
		rs.include(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		//add subject
				int suid = Integer.parseInt(request.getParameter("suid"));
				String subname = request.getParameter("subname");;
				//Integer sutid = Integer.parseInt(request.getParameter("sutid"));
						
				Subjects su = new Subjects();
				su.setSuid(suid);
				su.setSubname(subname);
				//su.setSutid(sutid);
						
				AcademyService as = new AcademyService();
				String resultu  = as.addSubject(su);
						
				pw.println(resultu);
						
				RequestDispatcher rs = request.getRequestDispatcher("subjectsHome.jsp");
				//rs.include(request, response);
		
		doGet(request, response);
	}

}
