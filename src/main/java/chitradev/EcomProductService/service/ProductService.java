package chitradev.EcomProductService.service;

import chitradev.EcomProductService.dto.FakeStoreProductResponseDTO;
import chitradev.EcomProductService.entity.Product;

import java.util.List;

public interface ProductService {
    List<FakeStoreProductResponseDTO> getAllProducts();
    Product getProduct(int productId);
    Product createProduct(Product product);
    boolean deleteProduct(int productId);
    Product updateProduct(Product updateProduct,int productId);

}
