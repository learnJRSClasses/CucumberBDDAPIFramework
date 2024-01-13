Feature: Get all products the api
  Scenario: Verify the get api for the products
    Given I hit the url of get products api endpoints
    When I pass the url of products in the request
    Then I receive the response code as 200


  Scenario Outline: Verify the get api for the products for rates
    Given I hit the url of get products api endpoints
    When I pass the url of products in the request
    Then I verify the rate of the first product is "<FirstProductRate>"
    Examples:
    |FirstProductRate|
    |             3.9|
    |             4.9|
    |             5.9|
    |             6.9|
    |             7.9|


