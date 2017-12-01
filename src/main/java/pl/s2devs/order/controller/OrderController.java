package pl.s2devs.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.s2devs.order.model.Order;
import pl.s2devs.order.repository.OrderRepository;
import pl.s2devs.order.service.OrderService;
import pl.s2devs.person.model.Person;
import pl.s2devs.person.service.ClientService;
import pl.s2devs.shared.response.RegistrationResponse;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/get/all")
    public ResponseEntity<List<Order>> getAllClients() {
        return ResponseEntity.ok(orderService.getOrderRepository().findAll());
    }
}