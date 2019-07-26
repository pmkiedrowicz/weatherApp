package serwer.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import serwer.config.Config;
import serwer.entity.User;

import java.util.List;

public class SessionFactory implements DaoInterface<SessionFactory> {
    private Session currentSession;
    private Transaction currentTransaction;


    public SessionFactory() {
        currentSession = Config.getSession();
        currentTransaction = currentSession.beginTransaction();
    }

    public Session openCurrentSession() {
        if (currentSession == null) {
            currentSession = Config.getSession();
            currentTransaction = currentSession.beginTransaction();
        }
        return currentSession;
    }

    public void closeCurrentSession() {
        currentTransaction.commit();
        currentSession.close();
    }

    public Session getCurrentSession() {
        return currentSession;
    }


//    public User save(User entity) {
//        getCurrentSession().save(entity);
//        return entity;
//    }

    @Override
    public SessionFactory save(SessionFactory entity) {
        getCurrentSession().saveOrUpdate(entity);
    return entity;
    }

    @Override
    public void update(SessionFactory entity) {
    }

    @Override
    public SessionFactory findByName(String name) {
        return null;
    }

    @Override
    public void delete(SessionFactory entity) {

    }

    @Override
    public List<SessionFactory> findAll() {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
