package com.aplha.ShoppingCart.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "cart_item_id")
    private int cart_item_id;

    @Column(name = "item")
    private UUID item;

    @ManyToOne
    @Column(name = "cart")
    private UUID cart;

    @Column(name = "item_quantity")
    private int item_quantity;

    @Column(name = "item_price")
    private double item_price;

    @Column(name = "total_price")
    private double total_price;

}
