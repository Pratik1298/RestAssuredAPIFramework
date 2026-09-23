package ToolShopAPITests;

import ToolShopAPIBase.ProductService;
import ToolShopAPIModels.Request.ProductRequest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductAPITest {

   @Test (description = "Retrieve all products Information")
    public void retrieveProductTest() {
        ProductService productService = new ProductService();
        Response response = productService.retrieveProducts();
        System.out.println(response.asPrettyString());

        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.getString("data[0].name")); // Nested field — brand
        System.out.println(jsonPath.getString("data[0].category.id"));
        System.out.println(jsonPath.getString("data[0].category.name"));// Nested field — image (2 levels of nesting, same pattern)
        System.out.println(jsonPath.getString("data[0].brand.name"));
        System.out.println(jsonPath.getList("data.id")); // Get ALL product IDs across every item in the array
        System.out.println(jsonPath.getList("data.category.name")); //// Get ALL category names across all products
        Assert.assertEquals(jsonPath.getString("data[0].name"), "Combination Pliers");
    }

    @Test (description = "Add new product")
    public void newProductTest() {
        ProductRequest productRequest = new ProductRequest.Builder().name("Heavy-Duty Wire Cutter").description("Precision wire cutter built with high-carbon steel blades for clean, effortless cuts through copper, aluminum, and steel wire. Ergonomic non-slip handles reduce hand strain during repetitive use.").price(12.99).categoryId("01M34PNTDPJ4JBH9XTB9X1M8PJ").brandId("01M34PNT3HBS96JVG0ZRWS6NCV").productImageId("01M34PNTE08GPZQN2W9Q44BA7X").isLocationOffer(0).isRental(0).co2Rating("C").build();
        ProductService productService = new ProductService();
        Response response =productService.storeNewProduct(productRequest);
        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());
        System.out.println(response.headers());
    }

    @Test (description = "Update existing Product")
    public void updateProductTest(){
        ProductRequest productRequest = new ProductRequest.Builder().name("String").description("String").price(1.99).categoryId("01JFG8Q5XKZJY4BEYQ87PC2Q1Y").brandId("01JFG8Q5XKZJY4BEYQ87PC2Q1Y").productImageId("01JFG8Q5XKZJY4BEYQ87PC2Q1Y").isLocationOffer(1).isRental(0).co2Rating("A").build();
        ProductService productService = new ProductService();
        Response response =productService.updateProduct(productRequest);
        System.out.println(response.asPrettyString());
    }


}