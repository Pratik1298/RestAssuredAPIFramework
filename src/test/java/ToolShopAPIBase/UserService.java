package ToolShopAPIBase;

import ToolShopAPIModels.Request.LoginRequest;
import ToolShopAPIModels.Request.RegisterRequest;
import ToolShopAPIModels.Request.UserRequest;
import io.restassured.response.Response;

import java.util.HashMap;

public class UserService extends BaseService {
    private static final String BASEPATH = "/users";

    public Response login(LoginRequest payload){

        return postRequest(payload,BASEPATH + "/login");
    }

    public Response userRegister(RegisterRequest payload){
        return postRequest(payload,BASEPATH+"/register");
    }

    public Response forgetPassword(String email){
        HashMap<String,String> payload = new HashMap<String,String>(); //Creates a HashMap to build the request body as key-value pairs.
        payload.put("email",email);                                    //This is a lightweight alternative to creating a full POJO like your earlier LoginRequest or UserRequest classes. For a simple one-field payload, a HashMap avoids the overhead of writing a whole class just to hold one key. It's a common shortcut in API test frameworks for small/simple request bodies.
        return postRequest(payload,BASEPATH+"/forgot-password");
    }
    public Response userInformation(String token){
        setAuthToken(token);
        return getRequest(BASEPATH+"/me");
    }


}
