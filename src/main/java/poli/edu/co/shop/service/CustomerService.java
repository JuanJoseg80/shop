package poli.edu.co.shop.service;

import poli.edu.co.shop.percistence.entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer save (Customer customer);

    List<Customer> findAll();
}
