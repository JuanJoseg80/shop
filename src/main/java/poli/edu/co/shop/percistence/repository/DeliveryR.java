package poli.edu.co.shop.percistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poli.edu.co.shop.percistence.entity.Delivery;

@Repository
public interface DeliveryR extends JpaRepository <Delivery,Long> {
}
