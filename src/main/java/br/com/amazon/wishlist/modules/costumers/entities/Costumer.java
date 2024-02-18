package br.com.amazon.wishlist.modules.costumers.entities;

import br.com.amazon.wishlist.modules.orders.entities.Order;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "costumers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Costumer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(unique = true, nullable = false)
    UUID id;
    String name;
    @Column(unique = true)
    String phone;
    @Column(unique = true)
    String mail;
    @Column(length = 60)
    String password;
    @OneToMany
    List<Order> orders;


}
