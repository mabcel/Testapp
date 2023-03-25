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

import com.entity.Classes;
import com.entity.Teachers;
import com.service.AcademyService;


/**
 * Servlet implementation class AcademyControllert
 */
@WebServlet("/AcademyControllert")
public class AcademyControllert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcademyControllert() {
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
		
		//view teachers
		List<Teachers> listOfTeachers = as.viewTeachers();
		Iterator<Teachers> ii = listOfTeachers.iterator();
		while(ii.hasNext()) {
			Teachers t = ii.next();
			pw.println("<div>");
			pw.println("<p>Teacher ID is "+t.getTid()+" Teacher name is "+t.getTname()+"</p>");
			pw.println("</div>");
		
		}	
			
		RequestDispatcher rt = request.getRequestDispatcher("teachersHome.jsp");
		rt.include(request, response);
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		//add teacher
		int tid = Integer.parseInt(request.getParameter("tid"));
		String tname = request.getParameter("tname");;
		//Integer tcid = Integer.parseInt(request.getParameter("tcid"));
				
		Teachers t = new Teachers();
		t.setTid(tid);
		t.setTname(tname);
		//t.setTcid(tcid);
		
						
		AcademyService as = new AcademyService();
		String resultt  = as.addTeacher(t);
				
		        pw.println(resultt);
				
				RequestDispatcher rt = request.getRequestDispatcher("teachersHome.jsp");
				//rt.include(request, response);		
						
		
		
		doGet(request, response);
	}

}
