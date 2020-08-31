package dao;

import models.Auto;
import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

import static utils.HibernateSessionFactoryUtil.getSessionFactory;

public class UserDao {

    public User findById(int id) {
        return getSessionFactory().openSession().get(User.class, id);
    }

    public void save(User user) {
        var session = getSessionFactory().openSession();
        var tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(User user) {
        Session session = getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    public Auto findAutoById(int id) {
        return getSessionFactory().openSession().get(Auto.class, id);
    }

    public List<User> findAll() {
        return (List<User>)  getSessionFactory().openSession().createQuery("From User").list();
    }
}
