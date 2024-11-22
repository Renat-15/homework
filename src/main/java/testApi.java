import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static java.util.Collections.emptyMap;
import static org.hamcrest.Matchers.*;

public class testApi {
    @Test
    public void testGetRequest() {
        RestAssured.baseURI = "https://postman-echo.com/get";

        Response response = RestAssured.given() // объект запроса. given() позволяет задавать параметры для http запроса
                .queryParam("foo1", "bar1") // добавляет параметр к URL строке запроса
                .queryParam("foo2", "bar2")
                .when()
                .get();

        response.then().statusCode(200); // строка на проверку равен ли стату с код 200

        response.then() // проверка ответа сервера
                .body("args.foo1", equalTo("bar1")) // проверка содержимого тела ответа
                .body("args.foo2", equalTo("bar2")); // первый параметр это путь к элементу, второй ожидаемое значение

        System.out.println("Response: " + response.asString());
    }
    @Test
    public void testPostRawText(){
        String requestBody = "This is expected to be sent back as part of response body.";
        RestAssured.baseURI = "https://postman-echo.com/post";

        Response response = RestAssured.given()
                .header("Content-Type", "text/plain")
                .body(requestBody)
                .when()
                .post();

        response.then().statusCode(200);

        response.then()
                .body("data", equalTo(requestBody));

        System.out.println("Response: " + response.asString());
    }

    @Test
    public void testPostFromData(){
        RestAssured.baseURI = "https://postman-echo.com";

        String key1 = "value1";
        String key2 = "value2";
        Response response = RestAssured.given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("key1", key1)
                .formParam("key2", key2)
                .when()
                .post("/post");

        Assert.assertEquals(200, response.getStatusCode());

        JsonPath jsonPath = response.jsonPath(); // для извлечения данных из json структуры
        Map<String, String> form = jsonPath.getMap("form"); // извлекаем часть json ответа, которая соответствует ключу form

        Assert.assertEquals(key1, form.get("key1"));
        Assert.assertEquals(key2, form.get("key2"));
    }

    @Test
    public void testPutRequest(){
        RestAssured.baseURI = "https://postman-echo.com";

        String requestBody = "This is expected to be sent back as part of response body.";

        Response response = RestAssured.given()
                .header("Content-Type", "text/plain")
                .body(requestBody)
                .when()
                .put("/put");

        Assert.assertEquals(200, response.getStatusCode());

        String responseBody = response.asString();
        Assert.assertTrue(responseBody.contains(requestBody));
        Assert.assertEquals("application/json; charset=utf-8", response.getContentType());
    }

    @Test
    public void testPatchRequest(){
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "This is expected to be sent back as part of response body.";

        Response response = RestAssured.given()
                .header("Content-Type", "text/plain")
                .body(requestBody)
                .when()
                .patch("/patch");
        Assert.assertEquals(200, response.getStatusCode());

        response.then()
                .body("data", equalTo(requestBody));
        System.out.println(response.asString());
    }

    @Test
    public void testDeleteRequest(){
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "This is expected to be sent back as part of response body.";

        Response response = RestAssured.given()
                .header("Content-Type", "text/plain")
                .body(requestBody)
                .when()
                .delete("/delete");

        Assert.assertEquals(200, response.getStatusCode());

        response.then()
                .body("data", equalTo(requestBody));
        System.out.println(response.asString());
    }
}
