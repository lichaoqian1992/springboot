package com.forezp.mongodb.dao;

import com.forezp.mongodb.entity.Customer;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
}
