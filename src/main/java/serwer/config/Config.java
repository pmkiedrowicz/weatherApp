package serwer.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Config {
    //basic connection configure, based on hibernate.cfg.xml
    private static SessionFactory sessionFactory =
            new Configuration()
                    .configure()
                    .buildSessionFactory();

    //checks if theres sessionFactory available
//    private static SessionFactory getSessionFactory() {
//        if (sessionFactory == null) {
//            sessionFactory = (SessionFactory) new Config();
//        }
//        return sessionFactory;
//    }


    //opens session
    private static Session session = sessionFactory.openSession();

    //checks if theres open session
    public static Session getSession() {
        if (session == null) {
            session = (Session) new Config();
        }
        return session;
    }

    //close current session
//    public static void closeConnection() {
//        session.close();
//        sessionFactory.close();
//    }
}
