package hibernate.onetoone;

import hibernate.onetomany.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by abhisheks on 18-07-2020.
 */
public class Driver {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        AdharCard adharCard = new AdharCard("1101","9654103437");
        Citizen citizen = new Citizen("1","akhil","noida",adharCard);
        adharCard.setCitizen(citizen);

        session.save(citizen);
        session.getTransaction().commit();
        session.close();
    }
}
