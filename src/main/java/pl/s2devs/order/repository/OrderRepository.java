package pl.s2devs.order.repository;

import antlr.collections.AST;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.s2devs.order.model.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findByid(int id);
}
