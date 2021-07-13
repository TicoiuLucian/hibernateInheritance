package ro.itschool;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ro.itschool.hibernate.util.HibernateUtil;
import ro.itschool.mappedsuperclass.ChildClassMappedSuperClass;

public class App {

	public static void main(String[] args) {
		Session currentSession = HibernateUtil.getSessionFactory().openSession();
		Transaction currentTransaction = currentSession.beginTransaction();

		ChildClassMappedSuperClass childClass = new ChildClassMappedSuperClass();

		currentSession.close();
	}
}
