package ToolShopAPIBase;

import ToolShopAPIModels.Request.ProductRequest;
import io.restassured.response.Response;

public class ProductService extends BaseService {

    private static final String BASEPATH = "/products";

    public Response retrieveProducts(){
        return getRequest(BASEPATH);
    }

    public Response storeNewProduct(ProductRequest payload){
        return postRequest(payload,BASEPATH);
    }

    public Response updateProduct(ProductRequest payload){
        return patchRequest(payload,BASEPATH + "/01M35EPWJ834K0VBX3X4D3J4K0");
    }

}
