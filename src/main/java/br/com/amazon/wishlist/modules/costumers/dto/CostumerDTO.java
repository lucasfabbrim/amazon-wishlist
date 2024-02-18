package br.com.amazon.wishlist.modules.costumers.dto;

import br.com.amazon.wishlist.modules.list.entities.ListEntity;

import java.util.List;

public record CostumerDTO(String name,
                          String phone,
                          String mail,
                          String password,
                          List<ListEntity> lists) {

}
