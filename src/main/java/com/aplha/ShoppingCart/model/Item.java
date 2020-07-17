package com.aplha.ShoppingCart.model;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Table
public class Item {

    @PrimaryKey
    @Column(name = "item_id")
    private UUID item_id;

    @Column(name = "item_name")
    private String item_name;

    @Column(name = "item_description")
    private String item_description;

    @Column(name = "item_stock")
    private int item_stock;

    @Column(name = "item_price")
    private double item_price;

}
