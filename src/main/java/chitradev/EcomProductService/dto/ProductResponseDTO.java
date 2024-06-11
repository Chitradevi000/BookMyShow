package chitradev.EcomProductService.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {
    /*
    data transfer objects which is nothing but holding the response attributes
     */

    private int productId;
    private String title;
    private double price;
    private String Category;
    private String decription;
    private String imageURL;
    private double rating;

    //you gonna have mapper class to convert the product entity to dto proper response with these attributes
}
