package hibernate.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhisheks on 11-07-2020.
 */
public class Driver {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        System.out.println(sessionFactory);
        Session session = sessionFactory.openSession();

        session.getTransaction().begin();

        Mobile homeMobile = new Mobile("9654103437","office","airtel");

        Mobile officeMobile = new Mobile("8744832505","home","idea");

        List mobiles = new ArrayList();
        mobiles.add(homeMobile);

        mobiles.add(officeMobile);

        Person person = new Person(102,"Akhil", mobiles);

        session.persist(person);
        session.getTransaction().commit();
        session.close();

        Session session1 = sessionFactory.openSession();
        Person person1 = session1.get(Person.class, 100);
        System.out.println("person p : "+person1);
        session1.close();
        sessionFactory.close();

    }
}
