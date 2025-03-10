package com.green.rest_test.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderDTO {
    private int itemNumber;
    private  String itemName;
    private  int price;
    private int count;
    private  String id;

    public OrderDTO(){

    }

    public OrderDTO(int itemNumber, String itemName, int price, int count, String id) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.price = price;
        this.count = count;
        this.id = id;
    }
}

