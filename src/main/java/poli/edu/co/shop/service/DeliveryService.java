package poli.edu.co.shop.service;

import poli.edu.co.shop.percistence.entity.Customer;
import poli.edu.co.shop.percistence.entity.Delivery;

import java.util.List;

public interface DeliveryService {

   Delivery save (Delivery delivery);
   List<Delivery> findAll();
}
