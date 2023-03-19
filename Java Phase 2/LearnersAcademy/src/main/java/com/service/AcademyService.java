package com.service;

import java.util.List;

import com.dao.AcademyDao;
import com.entity.Classes;
import com.entity.Students;
import com.entity.Subjects;
import com.entity.Teachers;

public class AcademyService {

	AcademyDao la  = new AcademyDao();
	
      // add class
	public String addClass(Classes classes) {
		if(la.addClass(classes)>0) {
			return "Class added successfully";
		}else {
			return "Class could not be added";
		}
	}
	
      // view class
	public List<Classes> viewClasses() {
		return la.viewClasses();
	}


      // add student
	public String addStudent(Students student) {
		if(la.addStudent(student)>0) {
			return "Student added successfully";
		}else {
			return "Student could not be added";
		}
	}
	
      // view student
	public List<Students> viewStudents() {
		return la.viewStudents();
	}


      // add subject
	public String addSubject(Subjects subject) {
		if(la.addSubject(subject)>0) {
			return "Subject added successfully";
		}else {
			return "Subject could not be added";
		}
	}
	
      // view subject
	public List<Subjects> viewSubjects() {
		return la.viewSubjects();
	}




      // add teacher
	public String addTeacher(Teachers teacher) {
		if(la.addTeacher(teacher)>0) {
			return "Teacher added successfully";
		}else {
			return "Teacher could not be added";
		}
	}
	
      // view teacher
	public List<Teachers> viewTeachers() {
		return la.viewTeachers();
	}
      


}