package hibernate.core.test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import hibernate.core.entity.AccoutDetails;
import hibernate.core.entity.Address;
import hibernate.core.entity.Author;
import hibernate.core.entity.Books;
import hibernate.core.entity.Employee;
import hibernate.core.entity.User;
import hibernate.core.entity.Veichle;

public class HibernateFile {

	public static void main(String[] args) {

		SessionFactory session = new Configuration().configure().buildSessionFactory();

		Session osession = session.getSessionFactory().openSession();
		osession.beginTransaction();
		/*
		 * Person operson = new Person(); operson.setPersonID(2);
		 * operson.setFirstName("Pavan"); operson.setLastName("Shetty");
		 * operson.setDate(new Date());
		 * 
		 * Address oaddress = new Address(); oaddress.setPincode("586214");
		 * oaddress.setStreet("Shivaji"); oaddress.setType("house");
		 * 
		 * operson.setOaddress(oaddress);
		 * 
		 * osession.save(operson); osession.save(oaddress);
		 * 
		 * osession.beginTransaction().commit(); osession.close();
		 */

		/*
		 * Employee e1 = new Employee(); e1.setName("Ravi Malik");
		 * e1.setEmail("ravi@gmail.com");
		 * 
		 * Address address1 = new Address();
		 * address1.setAddressLine1("G-21,Lohia nagar"); address1.setCity("Ghaziabad");
		 * address1.setState("UP"); address1.setCountry("India");
		 * address1.setPincode(201301);
		 * 
		 * e1.setAddress(address1); address1.setEmployee(e1);
		 */
		/*
		 * Author oauthor = new Author(); oauthor.setAuthorname("pavan");
		 * 
		 * Books obook = new Books(); obook.setBookname("Complete");
		 * 
		 * oauthor.getObook().add(obook);
		 * 
		 * Books obook3 = new Books(); obook3.setBookname("Complete");
		 * 
		 * oauthor.getObook().add(obook3);
		 * 
		 * Books obook2 = new Books(); obook2.setBookname("Java");
		 * 
		 * oauthor.getObook().add(obook2);
		 * 
		 * osession.save(oauthor);
		 */

		/*
		 * AccoutDetails oaccount=new AccoutDetails(); oaccount.setUserName("pavan");
		 * oaccount.setPassword("passwords"); osession.save(oaccount);
		 */
		/*
		 * for (int i = 0; i < 20; i++) { AccoutDetails oaccount = new AccoutDetails();
		 * 
		 * oaccount.setUserName("userName" + i); oaccount.setPassword("Password" + i);
		 * osession.save(oaccount); }
		 */
		List<AccoutDetails> olist = new ArrayList<AccoutDetails>();
		// Query ouery = osession.createNamedQuery("AccountDetails.n");
		/*
		 * ouery.setString("userName", "userName1"); olist = ouery.getResultList();
		 */
		AccoutDetails account = osession.get(AccoutDetails.class, 1);

		osession.getTransaction().commit();
		osession.close();

		Session osession2 = session.getSessionFactory().openSession();
		osession2.beginTransaction();
		AccoutDetails account2 = osession2.get(AccoutDetails.class, 1);
		osession2.getTransaction().commit();
		osession2.close();
	}

}
