package br.com.amazon.wishlist.modules.list.entities;

import br.com.amazon.wishlist.modules.costumers.entities.CostumerEntity;
import br.com.amazon.wishlist.modules.list.dto.ListDTO;
import br.com.amazon.wishlist.modules.product.entities.ProductEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "lists")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ListEntity {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    @Column(unique = true, nullable = false)
    private UUID id;
    @Column(unique = true)
    private UUID costumer_id;
    @Column(length = 100)
    private String name;
    private String description;
    @OneToMany
    private List<CostumerEntity> members;
    @OneToMany
    private List<ProductEntity> products;
    private Instant created_at;
    private Instant updated_at;

    public ListEntity(ListDTO dto){
        this.costumer_id = dto.costumer_id();
        this.name = dto.name();
        this.description = dto.description();
        this.members = dto.members();
        this.products = dto.products();
        this.created_at = Instant.now();
        this.updated_at = Instant.now();
    }

}
