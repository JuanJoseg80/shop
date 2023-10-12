package poli.edu.co.shop.percistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poli.edu.co.shop.percistence.entity.Customer;

@Repository
public interface CustomerR extends JpaRepository<Customer,Long> {
}
