package TestAutomation.API;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.Assert;

public class APIpost {



public static void main(String[] args) {
// TODO Auto-generated method stub

Response responsive = get("https://reqres.in/api/users");
responsive.prettyPrint();
int statusof = responsive.statusCode();
System.out.println(statusof);
Assert.assertEquals(statusof, 200);

ResponseBody verifing = responsive.getBody();
String converts = verifing.asString();
Assert.assertEquals(converts.contains("Tracey"), true);

File it = new File ("C:\\Users\\murat\\git\\BootCampAPI\\API\\Api.json");
Response gt = given().contentType(ContentType.JSON).body(it).post("https://reqres.in/api/users");
gt.prettyPrint();
}




		
	}


