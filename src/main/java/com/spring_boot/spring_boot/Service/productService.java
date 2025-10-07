package com.spring_boot.spring_boot.Service;

import com.spring_boot.spring_boot.Model.product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class productService {

    List<product> products = Arrays.asList(new product(10,"Iphone", 50000),new product(20,"samsung",200000),new product(30,"redmi",15000));
    public List<product> getProducts(){
        return products;

    }
}
