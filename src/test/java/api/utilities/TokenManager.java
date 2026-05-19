package api.utilities;

import api.endpoints.EmsMethods;
import api.payload.User;
import io.restassured.response.Response;

public class TokenManager {

    private static String accessToken;

    public static String getToken() {
        if (accessToken == null) {
            User user = TestDataLoader.getAccess();
            Response response = EmsMethods.getAuthToken(user);

            accessToken = response.jsonPath().getString("token.result");
        }
        return accessToken;
    }
}
