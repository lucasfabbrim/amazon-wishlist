package br.com.amazon.wishlist.modules.product.entities;

import br.com.amazon.wishlist.modules.costumers.entities.CostumerEntity;
import br.com.amazon.wishlist.modules.product.dto.ProductDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private String id;
    private String name;
    private String description;
    private Short price;
    private Instant created_at;
    private Instant updated_at;

    public ProductEntity(ProductDTO dto){
        this.name = dto.name();
        this.description = dto.description();
        this.price = dto.price();
        this.created_at = Instant.now();
        this.updated_at = Instant.now();
    }
}
