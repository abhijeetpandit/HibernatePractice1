package test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.abhi.datamodel.Student;

public class TestWithAnnotations {
	
	@Test
	public void testInsertData() {
		Configuration configuration = new Configuration().configure("/com/abhi/annotated/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		
		session.beginTransaction();
		Student student = new Student();
		student.setStudentname("Pandit");
		student.setPhoneNo("1242143");
		student.setAddress("Pune");
		
		session.persist(student);
		session.getTransaction().commit();
		session.close();
		
		
	}
	
	@Test
	public void testGetData() {
		Configuration configuration = new Configuration().configure("/com/abhi/annotated/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		
		session.beginTransaction();
		List students = session.createQuery("FROM Student").list();
		
		session.getTransaction().commit();
		session.close();
		Iterator sIterator = students.iterator();
		while(sIterator.hasNext()) {
			System.out.println(sIterator.next());
		}
		
	}
}
