package poli.edu.co.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import poli.edu.co.shop.percistence.entity.Delivery;
import poli.edu.co.shop.percistence.repository.DeliveryR;

import java.util.List;

@Service
@RequiredArgsConstructor

public class DeliveryServiceImp implements DeliveryService {

    private final DeliveryR deliveryR;

    @Override
    public Delivery save(Delivery delivery) {
        return deliveryR.save(delivery);
    }

    @Override
    public List<Delivery> findAll() {
        return deliveryR.findAll();
    }
}
