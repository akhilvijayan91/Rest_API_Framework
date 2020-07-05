Feature: Validating Place API's

Scenario: Verify if a place is being sucessfully added using Place API
	Given Add place Payload
	When user calls "AddPlaceAPI" with Post http request
	Then the API call got sucess with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"