package hibernate.onetomany;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by abhisheks on 11-07-2020.
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdownSessionFactory() {
        sessionFactory.close();
    }
}
