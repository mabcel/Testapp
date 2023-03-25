package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import com.entity.Classes;
import com.entity.Teachers;
import com.entity.Subjects;
import com.entity.Students;
import com.service.AcademyService;




/**
 * Servlet implementation class AcademyControllerr
 */
@WebServlet("/AcademyControllerr")
public class AcademyControllerr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcademyControllerr() {
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
		Subjects su = new Subjects();
		Teachers t = new Teachers();
		Students st = new Students();
		
		//view classes
		List<Subjects> listOfSubjects = as.viewSubjects();
		List<Teachers> listOfTeachers = as.viewTeachers();
		List<Students> listOfStudents = as.viewStudents();
		List<Classes> listOfClasses = as.viewClasses();
		Iterator<Classes> ii = listOfClasses.iterator();
		while(ii.hasNext()) {
			Classes c = ii.next();
		
			pw.println("<div>");
	//		pw.println("<img src="+p.getImageUrl()+" width=100 height=100/>");
			pw.println("<p>Class ID is "+c.getCid()+" Class Name is "+c.getCname()+"</p>");
			pw.println("</div>");
			
			pw.println("<div>");;
			pw.println("<p>Subject ID is "+su.getSuid()+" Subject Name is "+su.getSubname()+"</p>");
			pw.println("</div>");
			
			pw.println("<div>");;
			pw.println("<p>Teacher ID is "+t.getTid()+" Teacher Name is "+t.getTname()+"</p>");
			pw.println("</div>");
			
			pw.println("<div>");;
			pw.println("<p>Student id is "+st.getStid()+" Student Name is "+st.getStname()+"</p>");
			pw.println("</div>");
			
		}
		
		//request.setAttribute("listOfClasses", listOfClasses);
		RequestDispatcher rc = request.getRequestDispatcher("classesHome.jsp");
		rc.include(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		doGet(request, response);
	}

}
