package br.com.amazon.wishlist.modules.list.dto;

import br.com.amazon.wishlist.modules.costumers.entities.CostumerEntity;
import br.com.amazon.wishlist.modules.product.entities.ProductEntity;

import java.util.List;
import java.util.UUID;

public record ListDTO(UUID costumer_id,
                      String name,
                      String description,
                      List<CostumerEntity> members,
                      List<ProductEntity> products) {
}
