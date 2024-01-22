package com.lkk.SpringCourse.DAOs;

import com.lkk.SpringCourse.entities.Customer;

public interface CustomerDAO {

    void save(Customer theCustomer);

    Customer findByID(int customerID);
}
