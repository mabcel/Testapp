package com.dao;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.entity.Classes;
import com.entity.Students;
import com.entity.Subjects;
import com.entity.Teachers;
import com.resource.DbResource;

public class AcademyDao {

	//add classes
	public int addClass(Classes classes) {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
			session.save(classes);
		tran.commit();		
		return 1;
	}
	//view classes
	public List<Classes> viewClasses() {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("from Classes");
		List<Classes> listOfClasses = tq.getResultList();
		return listOfClasses;
	}
	
	//add student
	public int addStudent(Students student) {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
			session.save(student);
		tran.commit();		
		return 1;
	}
	//view student
	public List<Students> viewStudents() {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("from Students");
		List<Students> listOfStudents = tq.getResultList();
		return listOfStudents;
	}
	
	//add subject
	public int addSubject(Subjects subject) {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
			session.save(subject);
		tran.commit();		
		return 1;
	}
	
	// view subject
	public List<Subjects> viewSubjects() {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("from Subjects");
		List<Subjects> listOfSubjects = tq.getResultList();
		return listOfSubjects;
	}
	
	// add teacher
	public int addTeacher(Teachers teacher) {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
			session.save(teacher);
		tran.commit();		
		return 1;
	}
	
	// view teacher
	public List<Teachers> viewTeachers() {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("from Teachers");
		List<Teachers> listOfTeachers = tq.getResultList();
		return listOfTeachers;
	}
}