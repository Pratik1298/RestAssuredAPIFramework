package ToolShopAPITests;

import ToolShopAPIBase.BrandService;
import ToolShopAPIBase.ProductService;
import ToolShopAPIModels.Reponse.ProductResponse;
import ToolShopAPIModels.Request.BrandRequest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrandAPITest {

    @Test(description = "Verify if all the brands are retrieve")
    public void retrieveBrandTest(){
        ProductService productService = new ProductService();
        Response response = productService.retrieveProducts();
        System.out.println(response.asPrettyString());
        ProductResponse productResponse =response.as(ProductResponse.class);
    }

   @Test(description = "verify if new brand is store")
    public void storeNewProduct(){

        BrandRequest brandRequest = new BrandRequest("Hammer","pratik");
        BrandService brandService = new BrandService();
        Response response = brandService.storeNewBrand(brandRequest);
        System.out.println(response.asPrettyString());
        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.getString("name"));
        //Assert.assertEquals(jsonPath.getString("name"),"Hammer");
        System.out.println(jsonPath.getString("slug"));
        System.out.println(jsonPath.getString("id"));
    }

    @Test(description = "Verify if we can retrieve brand")
    public void retrieveSpecificBrand(){
        BrandService brandService = new BrandService();
        Response response = brandService.retrieveSpecificBrand();
        System.out.println(response.asPrettyString());
    }
}
