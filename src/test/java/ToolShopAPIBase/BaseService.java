package ToolShopAPIBase;

import static io.restassured.RestAssured.*;

import API.Filters.TestFilters;
import ToolShopAPIModels.Request.LoginRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService { //is meant to be a parent/base class that other test or API service classes will extend, so they all share the same setup.
    //Base URI
    //Creating The Request
    //Handling the Response

    private static final String BASE_URL="https://api.practicesoftwaretesting.com"; // is a constant holding the root URL of the API you're testing. Making the variable private and final
    private RequestSpecification requestSpecification; // RequestSpecification is Instances variable and it is initialze by constructor.
                                                       //will hold the reusable request configuration.

    static {
        RestAssured.filters(new TestFilters()); //UserService extends BaseService, so Java initializes BaseService first, and its static block runs before anything else in that class.
    }
    public BaseService(){                             //This runs automatically whenever a BaseService object is created.
        requestSpecification = given().baseUri(BASE_URL);//given() starts building a RestAssured request specification..
                                                         // .baseUri(BASE_URL) tells RestAssured that every request built from this specification should target api.practicesoftwaretesting.com.
    }//The result is stored in requestSpecification, so any subclass can reuse it instead of typing the base URI every time.

    protected void setAuthToken(String token){
        requestSpecification.header("Authorization","Bearer "+token);
    }

    protected Response postRequest(Object payload, String endpoints){
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoints);
    }

    protected Response getRequest(String endpoint){
       return requestSpecification.get(endpoint);
    }

    protected Response putRequest(Object payload, String endpoints){
        return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoints);
    }

    protected Response patchRequest(Object payload, String endpoints){
        return requestSpecification.contentType(ContentType.JSON).body(payload).patch(endpoints);
    }

}
