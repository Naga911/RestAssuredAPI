Feature: Validating GetApplicationByApplicationIdAPI API


  Scenario Outline: Verify user is able to make API successfully
    Given Add "<applicationId>" as Input
    When user calls "<API>" with "<method>" http request
    Then the API Call got success with status "<code>"


    Examples:
      | applicationId | API                                    | method | code |
      | 10            | GetApplicationByApplicationIdAPI       | GET    | 200  |
      | 56            | GetApplicationBuildingsByApplicationId | GET    | 200  |
