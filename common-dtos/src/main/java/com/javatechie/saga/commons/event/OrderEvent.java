package com.javatechie.saga.commons.event;

import com.javatechie.saga.commons.dto.OrderRequestDTO;
import lombok.Data;

import java.util.UUID;

@Data
public class OrderEvent {

    private UUID eventId = UUID.randomUUID();
    private OrderRequestDTO orderRequestDTO;
    private OrderStatus orderStatus;
}
