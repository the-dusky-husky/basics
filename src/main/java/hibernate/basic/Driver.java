package hibernate.basic;

import hibernate.onetomany.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by abhisheks on 19-07-2020.
 */
public class Driver {

    public static void main(String[] args) {

        Student student = new Student("Mikkel");

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        System.out.println(session.save(student));

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
