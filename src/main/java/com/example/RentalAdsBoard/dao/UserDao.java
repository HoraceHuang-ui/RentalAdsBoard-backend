package com.example.RentalAdsBoard.dao;
import com.example.RentalAdsBoard.entity.User;
import com.example.RentalAdsBoard.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Scope("prototype")
@Transactional
public class UserDao {

    public User getById(Integer userId){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(User.class, userId);
        }
    }

    public User getByUsername(String username) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM User WHERE username = :username";
            Query<User> query = session.createQuery(hql, User.class);
            query.setParameter("username", username);
            return query.uniqueResult();
        }
    }
}
