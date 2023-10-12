package poli.edu.co.shop.service;

import poli.edu.co.shop.percistence.entity.Order;

import java.util.List;

public interface OrderService {

    Order save (Order order);

    List<Order> findAll();
}
