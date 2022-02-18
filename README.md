#README
This project contains a couple of REST API test cases using RestAssured, java and TestNG for testing the document download endpoints.
 It also has json-server that allows for service mocking.

##Setup
This project uses RestAssured and TestNG to work. In order to acquire said libraries, it uses the maven build software. It assumes the following software is installed:

java,
maven,
node v.12 

It still needs to be parameterized, so a valid testng.xml file is needed at the root folder.

##Mock Server
Json server has been used in conjunction with express in order to create a mock server.  It is based on the "[Building a Fake and JWT Protected REST API with json-server](https://www.techiediaries.com/fake-api-jwt-json-server/)" article.  in order to run it, one must:

* cd into the `mock_server` directory
* run `npm install` to acquire the node dependencies.
* run `npm run start-auth`

## Running the tests

Finally, to run the tests use the following command:

`mvn clean test`

##TODO

The following items could not be completed due to time constraints:

* Delegate the rest assured calls to the implementation layer.
* Set up and teardown procedures to start and stop the auth server automatically
* Create more mocks for the different endpoints,
* Implement the rest of the test cases.
