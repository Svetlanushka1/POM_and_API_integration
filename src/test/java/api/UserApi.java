package api;

import com.jayway.restassured.response.Response;
import dto.AuthResponseDTO;
import dto.UserDTO;

import static com.jayway.restassured.RestAssured.given;

public class UserApi extends BaseApi{
    Response responseLoginRequest = null;

    private Response loginRequest(UserDTO user){
        return given()
                .body(user)
                .when()
                .post(baseUrl + "/v1/user/login/usernamepassword")
                .thenReturn();
    }

    public int getStatusCodeResponseLoginRequest(UserDTO user) {

        if(responseLoginRequest == null) {
            responseLoginRequest = loginRequest(user);
        }
        return responseLoginRequest.getStatusCode();

    }

    public String getToken(UserDTO user) {
        if (responseLoginRequest == null) {
            responseLoginRequest = loginRequest(user);
        }
        return responseLoginRequest.getBody().as(AuthResponseDTO.class).getAccessToken();
    }

}
