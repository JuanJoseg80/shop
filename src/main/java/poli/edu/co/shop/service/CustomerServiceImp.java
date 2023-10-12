package poli.edu.co.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import poli.edu.co.shop.percistence.entity.Customer;
import poli.edu.co.shop.percistence.repository.CustomerR;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImp implements CustomerService {

    private final CustomerR customerR;

    @Override
    public Customer save(Customer customer) {
        return customerR.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerR.findAll();
    }
}
