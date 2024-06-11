package chitradev.EcomProductService.client;

import chitradev.EcomProductService.dto.FakeStoreProductResponseDTO;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class FakeStoreClient {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Value("${fakestore.api.base.url}")
    private String fakestoreBaseURL;

    @Value("${fakestore.api.product.path}")
    private String fakeStoreAPIProductPath;

    public List<FakeStoreProductResponseDTO> getAllProducts() {
        //find the API of PRODUCT

        String fakeStoreAllProductURL = fakestoreBaseURL.concat(fakeStoreAPIProductPath);git
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO[]> productsList =
                restTemplate.getForEntity(fakeStoreAllProductURL,FakeStoreProductResponseDTO[].class);
        /*
        in the above line
        1. we used resttemplate.getforentity() to call the outside service
         -> NOTE: we can use resttemplate for calling our other own services
        2. in the above line the desesialization will also happen\


        3. getForEntity(URL, the object type you want to return(here we are return as JSON))
        4. restemplate will not support list, hence we are using array
         */
        return List.of(productsList.getBody());
    }
}
