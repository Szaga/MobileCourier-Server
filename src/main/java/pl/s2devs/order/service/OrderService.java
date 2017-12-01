package pl.s2devs.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.s2devs.order.model.Order;
import pl.s2devs.order.repository.OrderRepository;
import pl.s2devs.person.repository.PersonRepository;
import pl.s2devs.person.model.Person;

import static pl.s2devs.shared.response.RegistrationResponse.Code;

/**
 * Created by rafal on 14.11.17.
 */
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderRepository getOrderRepository() {
        return getOrderRepository();
    }


}
