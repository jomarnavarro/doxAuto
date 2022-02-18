package com.findox.test;

import com.findox.exception.ImplementationMissingException;
import com.findox.pojo.JwtAuthentication;
import com.findox.pojo.LoginPayload;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.notNullValue;

public class LoginTest extends BaseTest {

    @Test( groups = {"login"})
    public void validEmployeeLogin() throws ImplementationMissingException {
        JwtAuthentication jwtAuthentication =
                RestAssured
                    .given()
                        .contentType(ContentType.JSON)
                        .body(new LoginPayload("omarn@bigmkt.org", "test1234"))
                        .baseUri("http://localhost:3000")
                    .when()
                        .post("/login")
                        .peek()
                    .then()
                        .statusCode(HttpStatus.SC_OK)
                        .contentType(ContentType.JSON)
                        .body("access_token", notNullValue())
                    .extract()
                        .as(JwtAuthentication.class);
        Assert.assertTrue(jwtAuthentication.getAccessToken().startsWith("ey"));
    }

    @Test( groups = {"login"})
    public void validAdminLogin() throws ImplementationMissingException {
        JwtAuthentication jwtAuthentication =
                RestAssured
                        .given()
                        .contentType(ContentType.JSON)
                        .body(new LoginPayload("brian@findox.com", "brian"))
                        .baseUri("http://localhost:3000")
                        .when()
                        .post("/login")
                        .peek()
                        .then()
                        .statusCode(HttpStatus.SC_OK)
                        .contentType(ContentType.JSON)
                        .body("access_token", notNullValue())
                        .extract()
                        .as(JwtAuthentication.class);
        Assert.assertTrue(jwtAuthentication.getAccessToken().startsWith("ey"));    }

    @Test( groups = {"login"})
    public void validEmployeeLoginExtraKeysPayload() throws ImplementationMissingException {
        final Map<String, String> payloadExtraKeys = new HashMap<>();
        payloadExtraKeys.put("email", "omarn@bigmkt.org");
        payloadExtraKeys.put("password", "test1234");
        payloadExtraKeys.put("key", "value");
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(payloadExtraKeys)
                .baseUri("http://localhost:3000")
                .when()
                .post("/login")
                .peek()
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body("access_token", notNullValue());

    }

    @Test( groups = {"login"})
    public void invalidLoginMissingCreds() throws ImplementationMissingException {
        throw new ImplementationMissingException();
    }

    @Test( groups = {"login"})
    public void invalidLoginBlankCreds() throws ImplementationMissingException {
        throw new ImplementationMissingException();
    }

    @Test( groups = {"login"})
    public void invalidLoginNoPayload() throws ImplementationMissingException {
        throw new ImplementationMissingException();
    }
}
