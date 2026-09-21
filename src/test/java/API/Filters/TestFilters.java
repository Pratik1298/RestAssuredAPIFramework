package API.Filters;


import ToolShopAPITests.UserAPITest;
import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestFilters implements Filter {

    private static final Logger logger = LogManager.getLogger(TestFilters.class);
    @Override
    public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec, FilterContext ctx) {
        logRequest(requestSpec);
        Response response =ctx.next(requestSpec,responseSpec); // Request is going to excuted.
        logResponse(response);
        return response; // Test for assertion
    }

    public void logRequest(FilterableRequestSpecification requestSpec){
        logger.info("BaseURI:"+requestSpec.getBaseUri());
        logger.info("Request Header:"+requestSpec.getHeaders());
        logger.info("Request Payload:"+requestSpec.getBody());
    }

    public void logResponse(Response response){
        logger.info("Status code:"+response.getStatusCode());
        logger.info("Response Body:"+response.getBody());
        logger.info("Response Header:"+response.getHeaders());
    }
}
