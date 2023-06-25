package upskill.api.restassured;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import java.io.File;

public class PetstoreRestAssuredActions {
	
	public void creatPet()	{
		
		given().
            body(new File(System.getProperty("user.dir")+
		 "/src/test/resource/ApiRequestPayLoads/CreatePetRequest.json.")).
		 when().
	         header("Content-Type", "application/json").
	    post("https://petstore.swagger.io/v2/pet" ).
	    then().
	         log(). body().
	     and().
	         assertThat().statusCode(200).
	     and().
	         body(matchesJsonSchema(new File(System.getProperty("user.dir")+
	        		 "/src/test/resource/ApiResponsesSchemas/CreatePetResponse.json")));
	 }
	
	
 	public void getPet(){
	 given().
     when().
         header("Content-Type", "application/json").
         get("https://petstore.swagger.io/v2/pet/22").
    then().
         log(). body().
    and().
         assertThat().statusCode(200).
    and().
         body(matchesJsonSchema(new File(System.getProperty("user.dir")+
        "/src/test/resource/ApiResponsesSchemas/GetPetResponse.json")));	
	}
 	
	
    public void updatePet(){
	given().
        body(new File(System.getProperty("user.dir")+
        		"/src/test/resource/ApiRequestPayLoads/UpdatePetRequest.json")).
	 when().
         header("Content-Type", "application/json").
         put("https://petstore.swagger.io/v2/pet").
    then().
         log(). body().
     and().
         assertThat().statusCode(200).
     and().
         body(matchesJsonSchema(new File(System.getProperty("user.dir")+
        		 "/src/test/resource/ApiResponsesSchemas/UpdatePetResponse.json")));	
	}
	
	public void deletePet(){
	 given().
     when().
         header("Content-Type", "application/json").
         delete("https://petstore.swagger.io/v2/pet/22" ).
    then().
         log(). body().
     and().
         assertThat().statusCode(200).
     and().
         body(matchesJsonSchema(new File(System.getProperty("user.dir")+
        		 "/src/test/resource/ApiResponsesSchemas/DeletePetResponse.json")));	
	}
	    }



