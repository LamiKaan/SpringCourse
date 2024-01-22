package com.lkk.SpringCourse.DAOs;

import com.lkk.SpringCourse.entities.Customer;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
    // Define the entity manager field
    private EntityManager entityManager;

    // Inject entitiy manager object using constructor
    @Autowired
    public CustomerDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // Implement the save method
    @Override
    @Transactional
    public void save(Customer theCustomer) {
        this.entityManager.persist(theCustomer);
    }

    @Override
    @Transactional
    public Customer findByID(int customerID) {
        return this.entityManager.find();
    }
}
