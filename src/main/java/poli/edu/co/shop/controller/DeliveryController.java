package poli.edu.co.shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import poli.edu.co.shop.percistence.entity.Delivery;
import poli.edu.co.shop.service.DeliveryService;

import java.util.List;
@RestController
@RequestMapping("/delivery")
@RequiredArgsConstructor
public class DeliveryController {

 private final DeliveryService deliveryService;

@PostMapping
   public Delivery save (@RequestBody Delivery delivery) {

    return deliveryService.save(delivery);
}
@GetMapping
    public List<Delivery> findAll() {
    return deliveryService.findAll();

}
}



