package com.aplha.ShoppingCart.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Data
@Table
public class Cart {

    @PrimaryKey
    @Column(name = "cart_id")
    private UUID cart_id;

    @Column(name = "user")
    private UUID user;

    @Column(name = "total_quantity")
    private int total_quantity;

    @Column(name = "total_price")
    private double total_price;

    @OneToMany(mappedBy ="cart",fetch = FetchType.EAGER)
    @JsonIgnore
    @Column(name = "cart_items")
    private List<Integer> cart_items;

}
