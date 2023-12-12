package com.axnd.desafio01.services;

import org.springframework.stereotype.Service;

import com.axnd.desafio01.entities.Order;

@Service
public class ShippingService {

    public double shipment(Order order) {

        double shippingValue = 0;

        if (order.getBasic() < 100) {
            shippingValue = 20;

        } else if (order.getBasic() >= 100 && order.getBasic() <= 200) {
            shippingValue = 12;
        }

        return shippingValue;
    }

}
