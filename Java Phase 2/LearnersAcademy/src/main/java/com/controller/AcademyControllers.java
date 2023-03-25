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

import com.entity.Students;
import com.service.AcademyService;


/**
 * Servlet implementation class AcademyControllers
 */
@WebServlet("/AcademyControllers")
public class AcademyControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcademyControllers() {
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
		
		List<Students> listOfStudents = as.viewStudents();
		Iterator<Students> ii = listOfStudents.iterator();
		while(ii.hasNext()) {
			Students st = ii.next();
			pw.println("<div>");
			pw.println("<p>Stid is "+st.getStid()+" Stname is "+st.getStname()+"</p>");
			pw.println("</div>");
		}	
		
		RequestDispatcher rd = request.getRequestDispatcher("studentsHome.jsp");
		rd.include(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		//add student
				int stid = Integer.parseInt(request.getParameter("stid"));
				String stname = request.getParameter("stname");;
				//Integer scid = Integer.parseInt(request.getParameter("scid"));
						
				Students st = new Students();
				st.setStid(stid);
				st.setStname(stname);
				//st.setScid(scid);
					
				AcademyService as = new AcademyService();
				String results  = as.addStudent(st);
						
				pw.println(results);
						
				RequestDispatcher rd = request.getRequestDispatcher("studentsHome.jsp");
				//rd.include(request, response);
		
		
		doGet(request, response);
	}

}
