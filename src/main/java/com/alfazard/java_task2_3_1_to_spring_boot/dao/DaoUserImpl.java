package com.alfazard.java_task2_3_1_to_spring_boot.dao;

import com.alfazard.java_task2_3_1_to_spring_boot.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Alfazard on 08.07.2023
 */
@Repository
public class DaoUserImpl implements DaoUser {
    @PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager entityManager;

    public DaoUserImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public void addUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getUser(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUser(int id) {
        entityManager
                .createQuery("DELETE FROM User WHERE id =:userId")
                .setParameter("userId", id)
                .executeUpdate();
    }
}
