package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.Map;

public class HttpClientUtils {

    public static Response sendGetRequest(String env_prop_name, String endpoint, Map<String, String> headers, Map<String, String> queryParams, Map<String, Object> pathParams) {
        String base_uri = PropertyUtils.fetchEnvProperties(env_prop_name);
        RequestSpecification requestSpecification = RestAssured.given().log().all()
                .headers(headers);
        if (pathParams != null && !pathParams.isEmpty()) {
            requestSpecification = requestSpecification.pathParams(pathParams);
        }
        if (queryParams != null && !queryParams.isEmpty()) {
            requestSpecification = requestSpecification.queryParams(queryParams);
        }
        Response response = requestSpecification.when()
                .get(base_uri + endpoint).thenReturn();
        response.prettyPrint();
        return response;
    }

    public static Response sendPostRequest(String env_prop_name, String endpoint, String requestBody, Map<String, String> headers, Map<String, String> queryParams, Map<String, Object> pathParams) {
        String base_uri = PropertyUtils.fetchEnvProperties(env_prop_name);
        RequestSpecification requestSpecification = RestAssured.given().log().all()
                .headers(headers);
        if (pathParams != null && !pathParams.isEmpty()) {
            requestSpecification = requestSpecification.pathParams(pathParams);
        }
        if (queryParams != null && !queryParams.isEmpty()) {
            requestSpecification = requestSpecification.queryParams(queryParams);
        }
        Response response = requestSpecification.when()
                .body(requestBody)
                .post(base_uri + endpoint).thenReturn();
        response.prettyPrint();
        return response;
    }

    public static Response sendFormRequest(String env_prop_name, String endpoint, Map<String, String> headers, Map<String, String> queryParams, Map<String, Object> pathParams, Map<String, String> formParams) {
        String base_uri = PropertyUtils.fetchEnvProperties(env_prop_name);
        RequestSpecification requestSpecification = RestAssured.given().log().all()
                .headers(headers);
        if (pathParams != null && !pathParams.isEmpty()) {
            requestSpecification = requestSpecification.pathParams(pathParams);
        }
        if (queryParams != null && !queryParams.isEmpty()) {
            requestSpecification = requestSpecification.queryParams(queryParams);
        }
        Response response = requestSpecification.given()
                .formParams(formParams)
                .when()
                .post(base_uri + endpoint);
        response.prettyPrint();
        return response;
    }

    public static Response sendPutRequest(String env_prop_name, String endpoint, String requestBody, Map<String, String> headers, Map<String, String> queryParams, Map<String, Object> pathParams) {
        String base_uri = PropertyUtils.fetchEnvProperties(env_prop_name);
        RequestSpecification requestSpecification = RestAssured.given().log().all()
                .headers(headers);
        if (pathParams != null && !pathParams.isEmpty()) {
            requestSpecification = requestSpecification.pathParams(pathParams);
        }
        if (queryParams != null && !queryParams.isEmpty()) {
            requestSpecification = requestSpecification.queryParams(queryParams);
        }
        Response response = requestSpecification.when()
                .body(requestBody)
                .put(base_uri + endpoint).thenReturn();
        response.prettyPrint();
        return response;
    }

    public static Response sendPatchRequest(String env_prop_name, String endpoint, String requestBody, Map<String, String> headers, Map<String, String> queryParams, Map<String, Object> pathParams) {
        String base_uri = PropertyUtils.fetchEnvProperties(env_prop_name);
        RequestSpecification requestSpecification = RestAssured.given().log().all()
                .headers(headers);
        if (pathParams != null && !pathParams.isEmpty()) {
            requestSpecification = requestSpecification.pathParams(pathParams);
        }
        if (queryParams != null && !queryParams.isEmpty()) {
            requestSpecification = requestSpecification.queryParams(queryParams);
        }
        Response response = requestSpecification.when()
                .body(requestBody)
                .patch(base_uri + endpoint).thenReturn();
        response.prettyPrint();
        return response;
    }

    public static Response sendDeleteRequest(String env_prop_name, String endpoint, Map<String, String> headers, Map<String, String> queryParams, Map<String, Object> pathParams) {
        String base_uri = PropertyUtils.fetchEnvProperties(env_prop_name);
        RequestSpecification requestSpecification = RestAssured.given().log().all()
                .headers(headers);
        if (pathParams != null && !pathParams.isEmpty()) {
            requestSpecification = requestSpecification.pathParams(pathParams);
        }
        if (queryParams != null && !queryParams.isEmpty()) {
            requestSpecification = requestSpecification.queryParams(queryParams);
        }
        Response response = requestSpecification.when()
                .delete(base_uri + endpoint).thenReturn();
        response.prettyPrint();
        return response;
    }

}
