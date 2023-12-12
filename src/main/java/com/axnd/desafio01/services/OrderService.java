package com.axnd.desafio01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axnd.desafio01.entities.Order;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public double total(Order order) {
        double pedidoValue = order.getBasic() - (order.getBasic() * order.getDiscount() / 100);

        double freteValue = shippingService.shipment(order);

        return pedidoValue + freteValue;

    }

}
