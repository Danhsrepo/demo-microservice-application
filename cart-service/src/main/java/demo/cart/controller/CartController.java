package demo.cart.controller;

import demo.cart.service.UserClient;
import demo.cart.service.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CartController {

    @Autowired
    private UserClient user;

    @Autowired
    private ProductClient product;


    @GetMapping("/user/all")
    public String getCustomerName() { return user.getUserName();
    }

    @GetMapping("product/all")
    public String getPruductType() { return product.getProductData();}

    @GetMapping("bill")
    public String getBill() { return user.getUserName() + " : " + product.getProductData() ;
    }

}
