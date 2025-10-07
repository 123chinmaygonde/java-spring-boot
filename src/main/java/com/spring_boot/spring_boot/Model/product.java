package com.spring_boot.spring_boot.Model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class product {
    private int prodId;
    private String prodName;
    private int prodPrice;
}
