package ro.itschool;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ro.itschool.hibernate.util.HibernateUtil;
import ro.itschool.joinedtable.ChildClass2JoinedTable;
import ro.itschool.joinedtable.ChildClassJoinedTable;
import ro.itschool.joinedtable.ParentClassJoinedTable;
import ro.itschool.mappedsuperclass.ChildClass2MappedSuperClass;
import ro.itschool.mappedsuperclass.ChildClassMappedSuperClass;
import ro.itschool.mappedsuperclass.ParentClassMappedSuperClass;
import ro.itschool.singletable.ChildClass2SingleTable;
import ro.itschool.singletable.ChildClassSingleTable;
import ro.itschool.singletable.ParentClassSingleTable;
import ro.itschool.tableperclass.ChildClass2TablePerClass;
import ro.itschool.tableperclass.ChildClassTablePerClass;
import ro.itschool.tableperclass.ParentClassTablePerClass;

public class App {

	public static void main(String[] args) {
		Session currentSession = HibernateUtil.getSessionFactory().openSession();
		Transaction currentTransaction = currentSession.beginTransaction();
		ChildClassMappedSuperClass childClass = new ChildClassMappedSuperClass();
		
		ChildClass2JoinedTable cc2jt = new ChildClass2JoinedTable();
		cc2jt.setName("Dorinel Munteanu the big brother");
		ChildClassJoinedTable ccjt = new ChildClassJoinedTable();
		ccjt.setChildName("The first chiled!");
		ParentClassJoinedTable pcjt = new ParentClassJoinedTable();
		pcjt.setName("I am the parent");
		
		currentSession.save(cc2jt);
		currentSession.save(ccjt);
		currentSession.save(pcjt);
		
		ChildClassMappedSuperClass ccmsc = new ChildClassMappedSuperClass();
		ccmsc.setChildName("Hello there general..");
		ChildClass2MappedSuperClass cc2msc = new ChildClass2MappedSuperClass();
		cc2msc.setChildClass2Name("No idea how to name u");
		
		currentSession.save(ccmsc);
		currentSession.save(cc2msc);
		
		ChildClass2SingleTable cc2st = new ChildClass2SingleTable();
		cc2st.setChildClass2Name("My name is Captain Jack the terible");
		ChildClassSingleTable ccst = new ChildClassSingleTable();
		ccst.setChildName("ChilClassSingleTable");
		ParentClassSingleTable pcst = new ParentClassSingleTable();
		pcst.setName("You can do it!");
		
		currentSession.save(cc2st);
		currentSession.save(ccst);
		currentSession.save(pcst);
		
		ChildClass2TablePerClass cc2tpc = new ChildClass2TablePerClass(432, "What to say" , "I know!");
		ChildClassTablePerClass cctpc = new ChildClassTablePerClass(13333, "yes", "no");
		ParentClassTablePerClass pctpc = new ParentClassTablePerClass(123, "gogogog");
		
		currentSession.save(cc2tpc);
		currentSession.save(cctpc);
		currentSession.save(pctpc);
		
		currentTransaction.commit();
		currentSession.close();

		currentSession.close();
	}
}
