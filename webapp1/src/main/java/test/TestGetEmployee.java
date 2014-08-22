package test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.abhi.datamodel.Employee;

public class TestGetEmployee {
	@Test
	public void testinsert() {
		
		try {
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			Employee employee1 = new Employee(1, "Abhijeet", 1); 
			Employee employee2 = new Employee(2, "Pandit", 1);
			session.save(employee1);
			session.save(employee2);
			session.getTransaction().commit();
			/*Employee employee = (Employee) session.load(Employee.class, 1);
			System.out.println(employee);*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetRecords() {
		
		try {
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			List<Employee> employees = session.createQuery("FROM Employee").list();
			for(Employee employee : employees) {
				System.out.println(employee);
			}
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
