package com.spring_boot.spring_boot.Controller;

import com.spring_boot.spring_boot.Model.product;
import com.spring_boot.spring_boot.Service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class productController {
    @Autowired
    productService service;

    @RequestMapping("/products")
    public List<product> getProducts(){
        return service.getProducts();

    }

}
