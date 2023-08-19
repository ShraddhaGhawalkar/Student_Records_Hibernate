package hibernatepack;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Studentmain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		Student s = new Student();
		s.setRoll(29);
		s.setName("Shraddha");
		s.setAddress("Parli");
		
		session.persist(s);	//hql (for insertion)
		t.commit();
		session.close();
		System.out.println("Success...");
	}

}
