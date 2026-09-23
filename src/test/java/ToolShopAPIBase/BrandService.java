package ToolShopAPIBase;

import ToolShopAPIModels.Request.BrandRequest;
import io.restassured.response.Response;

public class BrandService extends BaseService {

    private static final String BASEPATH = "/brands";


    public Response retrieveBrand(){
          return getRequest(BASEPATH);
    }

    public Response storeNewBrand(BrandRequest payload){
        return postRequest(payload,BASEPATH);
    }

    public Response retrieveSpecificBrand(){
       return getRequest(BASEPATH+"/01m37xpb4pnbf0z6gx7rkc4480");
    }

}
