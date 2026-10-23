package org.example.tests.crud;

import io.qameta.allure.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.example.endpoints.APIConstants;
import org.example.modules.PayloadManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TestCreateBookingGET {
    public PayloadManager payloadManager;
    public Response response;
    public ValidatableResponse validatableResponse;

    @Link(name = "Website", url = "https://sdet.live/")
    @Issue("AUTH-123")
    @TmsLink("TMS-456")
    @Owner("Rajarshee-Bhattacharjee")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that POST request is working fine.")
    @Test
    public void testVerifyCreateBookingPOST01(){
        requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);

        response = RestAssured.given(requestSpecification)
                .when().body(payloadManager.createpayloadBookingAsString()).post();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

        Assert.assertEquals(true,true);
    }



}
