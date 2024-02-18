package br.com.amazon.wishlist.modules.orders.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Data
@Entity(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(unique = true, nullable = false)
    UUID id;
}
