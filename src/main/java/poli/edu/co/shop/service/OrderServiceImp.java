package poli.edu.co.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import poli.edu.co.shop.percistence.entity.Order;
import poli.edu.co.shop.percistence.repository.OrderR;

import java.util.List;

@Service
@RequiredArgsConstructor
public  class OrderServiceImp  implements OrderService  {
    private final OrderR orderR;

    @Override
    public Order save(Order order) {
        return orderR.save(order);
    }

    @Override
    public List<Order> findAll() {
        return orderR.findAll();
    }
}
