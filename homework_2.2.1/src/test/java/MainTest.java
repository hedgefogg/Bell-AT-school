import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

public class MainTest {
    @Test
    public void jsonArrayTest() {

    }

    @Test
    public void firstTest2() {
        Response resp = given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .log().all()
                .body("data.avatar", notNullValue())
                .body("per_page", notNullValue())
                .body("data.id", not(hasItem((nullValue()))))
                .extract()
                .response();
        JsonPath jsonNewUser = resp.jsonPath();
        Assert.assertFalse(jsonNewUser.get("page").toString().isEmpty(), "page is null");
        jsonNewUser.getList("data.avatar")
                .forEach(x -> Assert.assertFalse(x.toString().isEmpty(), "data.avatar is null"));
        List<String> a = jsonNewUser.getList("data.avatar");
        for (String x : a) {
            Assert.assertTrue(x.contains("128.jpg"));
            Assert.assertFalse(x.toString().isEmpty(), "data.avatar is null");
        }
        System.out.println(a);

    }
}
