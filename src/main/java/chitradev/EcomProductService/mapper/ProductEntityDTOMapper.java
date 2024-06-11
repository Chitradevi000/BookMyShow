package chitradev.EcomProductService.mapper;

import chitradev.EcomProductService.dto.ProductResponseDTO;
import chitradev.EcomProductService.entity.Product;

public class ProductEntityDTOMapper {

    public static ProductResponseDTO ocnvertProductEntityToProductResponseDTO(Product product)
    {
        /*
        You have to collect the attributes from ProductResponseDTO class and create a response here
         */
        ProductResponseDTO productResponseDTO=new ProductResponseDTO();
        productResponseDTO.setProductId(product.getId());
        productResponseDTO.setCategory(product.getCategory());
        productResponseDTO.setDecription(product.getDecription());
        productResponseDTO.setRating(product.getRating());
        productResponseDTO.setPrice(product.getPrice());
        productResponseDTO.setTitle(product.getTitle());
        productResponseDTO.setImageURL(product.getImageURL());

        return productResponseDTO;

    }
}
