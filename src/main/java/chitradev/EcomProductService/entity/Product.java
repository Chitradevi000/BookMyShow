package chitradev.EcomProductService.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private int id;
    private String title;
    private double price;
    private String Category;
    private String decription;
    private String imageURL;
    private double rating;
}
