Feature: Validating CreateorUpdate API

  Scenario: Verify if application is being added successfully to CreateorUpdate API
    Given Add application payload
    When User calls "CreateOrUpdateAPI" with "POST" http request
    Then the API Call is success with status code 200

