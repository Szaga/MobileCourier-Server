package pl.s2devs.order.model;


import pl.s2devs.person.model.Person;

import javax.persistence.*;
import javax.validation.constraints.NotNull;



@Entity
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    @NotNull
    @OneToOne
    @JoinColumn(name = "id")
    private Person assignedCourier;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id")
    private Person sender;

    @NotNull
    @OneToOne
    @JoinColumn(name = "id")
    private OrderDetails orderDetails;

    public enum Status {
        CREATED,
        PENDING,
        ACCEPTED,
        CANCELLED,
        ON_THE_WAY,
        DONE
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Person getAssignedCourier() {
        return assignedCourier;
    }

    public void setAssignedCourier(Person assignedCourier) {
        this.assignedCourier = assignedCourier;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }
}
