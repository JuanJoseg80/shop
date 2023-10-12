package poli.edu.co.shop.percistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poli.edu.co.shop.percistence.entity.Order;

@Repository
public interface OrderR extends JpaRepository<Order,Long> {
}
