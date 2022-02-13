package support;

import data.json.Inputdata;
import data.constants.TestConst;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PetData {
    String URL;

    Inputdata data = new Inputdata();

    public void getPetDetails()
        {
            URL = TestConst.url+"/"+TestConst.ID;
           System.out.println("URL - " + URL);
          Response responseString = given()
                  .contentType("application/json")
                  .when()
                  .get(URL)
                  .then()
                  .extract()
                  .response();

          System.out.println("Pet details response" +responseString.asString());
        }

        public void insertPetDetailsUsingJson()
        {
            String reqBody = data.PetDataJSON();
            URL = TestConst.url;
            given().contentType("application/json").body(reqBody).
                    when().
                    post(URL).
                    then()
                    .statusCode(200).log().body();
        }

    public void getList(List<Map<String,String>> list)
    {
       int listSize = list.size();
       for(int i=0;i<listSize;i++){
          TestConst.ID = list.get(i).get("id");
           TestConst.categoryID = list.get(i).get("categoryID");
           TestConst.tagID = list.get(i).get("tagID");
           TestConst.CategoryName = list.get(i).get("categoryName");
           TestConst.name = list.get(i).get("name");
           TestConst.tagName = list.get(i).get("tagName");
           TestConst.Status = list.get(i).get("Status");

           insertPetDetailsUsingJson();

           getPetDetails();

       }
    }
    }



