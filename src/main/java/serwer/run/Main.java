package serwer.run;

import serwer.dao.SessionFactory;
import serwer.entity.Records;
import serwer.entity.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //initialization
        SessionFactory sessionFactory = new SessionFactory();

        Records record = new Records();
        record.setTemperature(22.5);
        record.setHumidity(46.5);
        Date date = new Date();
        record.setDate(date);
        User user = new User();
        user.setUserId(1);
//        user.setUserName("Zdzichu12");
        record.setUser(user);
//        sessionFactory.openCurrentSession().save(user);
        sessionFactory.openCurrentSession().save(record);


        sessionFactory.closeCurrentSession();


//        dao.save(user);
//        dao.closeCurrentSession();


    }
}
