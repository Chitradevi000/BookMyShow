package chitradev.EcomProductService.controller;

import chitradev.EcomProductService.dto.FakeStoreProductResponseDTO;
import chitradev.EcomProductService.entity.Product;
import chitradev.EcomProductService.service.FakeStoreProductServiceImpl;
import chitradev.EcomProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;//field injection

    /*
    there are other injections - constructor injection,
     getter setter injection
     */

    @GetMapping("/product")
    public ResponseEntity getAllProducts()
    {
        List<FakeStoreProductResponseDTO> products= productService.getAllProducts();
        return ResponseEntity.ok(products);
    }



}
