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
import com.entity.Subjects;
import com.entity.Students;
import com.service.AcademyService;


/**
 * Servlet implementation class AcademyController
 */
@WebServlet("/AcademyController")
public class AcademyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcademyController() {
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
		
		//view classes
		List<Classes> listOfClasses = as.viewClasses();
		Iterator<Classes> ii = listOfClasses.iterator();
		while(ii.hasNext()) {
			Classes c = ii.next();
			pw.println("<div>");
	//		pw.println("<img src="+p.getImageUrl()+" width=100 height=100/>");
			pw.println("<p>Cid is "+c.getCid()+" CName is "+c.getCname()+"</p>");
			pw.println("</div>");
		}
		
		//request.setAttribute("listOfClasses", listOfClasses);
		RequestDispatcher rc = request.getRequestDispatcher("classesHome.jsp");
		rc.include(request, response);
		
		
	

		
//		
//		//view students
//		List<Students> listOfStudents = as.viewStudents();
//		request.setAttribute("listOfStudents", listOfStudents);
//		RequestDispatcher rd = request.getRequestDispatcher("viewStudent.jsp");
//		rd.include(request, response);
//		
//		//view subjects
//		List<Subjects> listOfSubjects = as.viewSubjects();
//		request.setAttribute("listOfSubjects", listOfSubjects);
//		RequestDispatcher rs = request.getRequestDispatcher("viewSubject.jsp");
//		rs.include(request, response);
//		
//		//view teachers
//		List<Teachers> listOfTeachers = as.viewTeachers();
//		request.setAttribute("listOfTeachers", listOfTeachers);
//		RequestDispatcher rt = request.getRequestDispatcher("viewTeacher.jsp");
//		rt.include(request, response);
//		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		//add class
		int cid = Integer.parseInt(request.getParameter("cid"));
		String cname = request.getParameter("cname");;
		//Integer ctid = Integer.parseInt(request.getParameter("ctid"));
		
		Classes c = new Classes();
		c.setCid(cid);
		c.setCname(cname);
		//c.setCtid(ctid);
		
		AcademyService as = new AcademyService();
		String result  = as.addClass(c);
		
		pw.println(result);
		
		RequestDispatcher rc = request.getRequestDispatcher("classesHome.jsp");
		rc.include(request, response);
		
		
//		//add student
//		int stid = Integer.parseInt(request.getParameter("stid"));
//		String stname = request.getParameter("stname");;
//		//Integer scid = Integer.parseInt(request.getParameter("scid"));
//				
//		Students st = new Students();
//		st.setStid(stid);
//		st.setStname(stname);
//		//st.setScid(scid);
//			
//		//AcademyService as = new AcademyService();
//		String results  = as.addStudent(st);
//				
//		pw.println(results);
//				
//		RequestDispatcher rd = request.getRequestDispatcher("studentsHome.jsp");
//		rd.include(request, response);
//		
//				
//		//add subject
//		int suid = Integer.parseInt(request.getParameter("suid"));
//		String subname = request.getParameter("subname");;
//		//Integer sutid = Integer.parseInt(request.getParameter("sutid"));
//				
//		Subjects su = new Subjects();
//		su.setSuid(suid);
//		su.setSubname(subname);
//		//su.setSutid(sutid);
//				
//		//AcademyService as = new AcademyService();
//		String resultu  = as.addSubject(su);
//				
//				pw.println(resultu);
//				
//				RequestDispatcher rs = request.getRequestDispatcher("subjectsHome.jsp");
//				rs.include(request, response);
//				
//				
//				
//		//add teacher
//		int tid = Integer.parseInt(request.getParameter("tid"));
//		String tname = request.getParameter("tname");;
//		//Integer tcid = Integer.parseInt(request.getParameter("tcid"));
//				
//		Teachers t = new Teachers();
//		t.setTid(tid);
//		t.setTname(tname);
//		//t.setTcid(tcid);
//						
//		//AcademyService as = new AcademyService();
//		String resultt  = as.addTeacher(t);
//				
//		        pw.println(resultt);
//				
//				RequestDispatcher rt = request.getRequestDispatcher("teachersHome.jsp");
//				rt.include(request, response);		
//						
				
		doGet(request, response);
	}

}
