package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        

        StudentName studentName = new StudentName();
        studentName.setFirstName("Mohamed");
        studentName.setLastName("Timor");
        studentName.setMiddleName("Timo");
        
        Student mohamed = new Student();
        mohamed.setId(2);
        mohamed.setColor("Red");
        mohamed.setName(studentName);
        
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
        
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        
        session.save(mohamed);
        
        transaction.commit();
        
        System.out.println(mohamed);
    }
}
