package poli.edu.co.shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import poli.edu.co.shop.percistence.entity.Order;
import poli.edu.co.shop.service.OrderService;

import java.util.List;

@RestController
@RequestMapping ("/order")
@RequiredArgsConstructor
public class OrderController {


    private final OrderService orderService;


    @PostMapping
   public Order save (@RequestBody Order order) {
        return orderService.save(order);
    }
    @GetMapping
    public List<Order> findAll(){
        return orderService.findAll();
    }
}



