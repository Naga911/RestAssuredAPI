Feature: Validating Registration API

Scenario: Verify user is able to make Registration successfully 
    Given Add Registration payload
    When User call "RegistrationAPI" with "POST" http request
    Then API Call is success with status code 200
    And "success" in response body is "true"


     