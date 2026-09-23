package ToolShopAPITests;

import static io.restassured.RestAssured.*;

import API.listeners.TestListeners;
import ToolShopAPIBase.UserService;
import ToolShopAPIModels.Reponse.LoginResponse;
import ToolShopAPIModels.Reponse.ProfileResponse;
import ToolShopAPIModels.Request.LoginRequest;
import ToolShopAPIModels.Request.RegisterRequest;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListeners.class)
public class UserAPITest {

    private static final Logger logger = LogManager.getLogger(UserAPITest.class);

  @Test(description = "Verfiy if login API is working")
    public void loginTest(){
        LoginRequest loginRequest = new LoginRequest("customer@practicesoftwaretesting.com","welcome01");
        UserService userService = new UserService();
        Response response =userService.login(loginRequest);
        LoginResponse loginResponse = response.as(LoginResponse.class); // response get JSON object and "as" method is to convert JSON object into Java Object of new Loginresponse

        System.out.println(response.asPrettyString());
        System.out.println(loginResponse.getAccess_token());
        System.out.println(loginResponse.getExpires_in());
        System.out.println(loginResponse.getToken_type());


       // Assert.assertEquals(loginResponse.getToken_type(),"bearer");
    }

   @Test(description = "Verfiy if user is getting verfied")
    public void userRegister(){

       RegisterRequest registerRequest =new RegisterRequest.Builder().first_name("Pratik").last_name("Bhosale").phone("0987654321").dob("1998-05-12").password("JJffaaa!67").email("pratik@doe.example")
                .build(); // Builder pattern

       UserService userService = new UserService();
       Response response = userService.userRegister(registerRequest);
       System.out.println(response.asPrettyString());
        System.out.println(response.headers());
        System.out.println(response.statusCode());
    }

 @Test(description = "Verfiy if forgot password is verfied")
    public void forgetPassword(){

        UserService userService = new UserService();
        Response response =userService.forgetPassword("pratik@doe.example");
        System.out.println(response.asPrettyString());
    }

    @Test(description = "Verfiy if user is getting the information")
    public void userInformation(){
       // LoginRequest loginRequest = new LoginRequest("customer@practicesoftwaretesting.com","welcome01");
        UserService userService = new UserService();
        Response response =userService.login(new LoginRequest("customer@practicesoftwaretesting.com","welcome01"));
        LoginResponse loginResponse = response.as(LoginResponse.class); // response get JSON object and "as" method is to convert JSON object into Java Object of new Loginresponse

        System.out.println(loginResponse.getAccess_token());
        response =userService.userInformation(loginResponse.getAccess_token());
        System.out.println(response.asPrettyString());
        ProfileResponse profileResponse = response.as(ProfileResponse.class);
        //Assert.assertEquals(profileResponse.getFirst_name(),"Jane");
    }

}
