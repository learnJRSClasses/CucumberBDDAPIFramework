package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Product {
    @Given("I hit the url of get products api endpoints")
    public void I_hit_the_url_of_get_products_api_endpoints()
    {
        RestAssured.baseURI = "https://fakestoreapi.com/" ;
        RequestSpecification httpRequest = RestAssured.given();
        Response res = httpRequest.get("products");



    }
    @When("I pass the url of products in the request")
    public void  i_pass_the_url_of_products_in_the_request() {
        System.out.println("in When statement");

    }
    @Then("I receive the response code as {int}")
    public void i_receive_the_response_code_as(Integer int1) {

        System.out.println("in Then statement");

    }



    @Then("I verify the rate of the first product is {}")
    public void I_verify_the_rate_of_the_first_product_is(String rate1) {
        {

           /* RestAssured.baseURI = "https://fakestoreapi.com/" ;
            RequestSpecification httpRequest = RestAssured.given();
            Response res = httpRequest.get("products");*/

           /* String rate1 = res.jsonPath().getJsonObject("rating[o].rate").toString() ;
            System.out.println("Rate is --" + rate);
*/
        }
    }


}


