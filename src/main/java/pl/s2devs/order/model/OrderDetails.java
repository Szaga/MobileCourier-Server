package pl.s2devs.order.model;

import pl.s2devs.person.model.Person;
import pl.s2devs.person.model.PersonDetails;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String items;

    @NotNull
    @OneToOne
    private String description;

    @NotNull
    @OneToOne
    @JoinColumn(name = "id")
    private PersonDetails personDetails;

}