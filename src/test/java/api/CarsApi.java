package api;


import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import dto.AddCarDTO;

import static com.jayway.restassured.RestAssured.given;

public class CarsApi extends BaseApi{

    Response responseCreateNewCar = null;
    Response responseDeleteOneCarBySerNum = null;

    private Response addNewCarRequest(AddCarDTO addCarDto, String token) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization", token)
                .body(addCarDto)
                .when()
                .post(baseUrl + "/v1/cars").thenReturn();
    }

    public Response deleteOneCarBySerNum(String serNum, String token) {
        responseDeleteOneCarBySerNum =
                given()  /// add link url
                        .header("Authorization", token)
                        .when()
                        .delete(baseUrl + "/v1/cars/" + serNum).thenReturn();
        return responseDeleteOneCarBySerNum;
    }

    public int getStatusCodeDeleteOneCarBySerNum(String serNum, String token) {
        if(responseDeleteOneCarBySerNum == null) {
            responseDeleteOneCarBySerNum = deleteOneCarBySerNum(serNum, token);
        }
        return responseDeleteOneCarBySerNum.getStatusCode();
    }

    public void setStatusCodeDeleteOneCarBySerNum() {
        responseDeleteOneCarBySerNum = null;
    }

    public int getStatusCodeCreateNewCar(AddCarDTO addCarDto, String token) {
        if(responseCreateNewCar == null) {
            responseCreateNewCar = addNewCarRequest(addCarDto, token);
        }
        return responseCreateNewCar.getStatusCode();
    }

    public void setResponseCreateNewCarNull() {
        responseCreateNewCar = null;
    }
}
