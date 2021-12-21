package demo.product.controller;

import demo.product.entity.Product;
import demo.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProductController {

    @Autowired
    public ProductRepository productRepository;

    @GetMapping("/allProduct")
    public List<Product> getAllProduct() {
        return (List<Product>) productRepository.findAll();
    }



}
