package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.abhi.datamodel.ContractEmp0;
import com.abhi.datamodel.Employee;
import com.abhi.datamodel.RegularEmp0;

public class TestHierarchy1 {
	@Test
	public void testInsert() {
		Configuration configuration = new Configuration().configure("/com/abhi/annotated/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		ContractEmp0 contractEmp0 = new ContractEmp0();
		contractEmp0.setEmpId(1);
		contractEmp0.setEmpName("Cont emp name");
		contractEmp0.setSalaryPerHour(500);
		contractEmp0.setWorkingHours(8);
		
		RegularEmp0 regularEmp0 = new RegularEmp0();
		regularEmp0.setEmpId(2);
		regularEmp0.setEmpName("Cont emp name");
		regularEmp0.setSalary(500000);
		regularEmp0.setBonus(55555);
		
		session.persist(contractEmp0);
		session.persist(regularEmp0);
		session.getTransaction().commit();
		
		session.close();
	}
}
