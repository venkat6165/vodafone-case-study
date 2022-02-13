package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import support.PetData;

import java.util.List;
import java.util.Map;

public class StepDefs {

    PetData petData = new PetData();

    @Given("the pet details")
    public void the_pet_details( ) {
        System.out.println("");

    }
    @When("the request has been made to post the pet details")
    public void the_request_has_been_made_to_post_the_pet_details(DataTable dt) {
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        petData.getList(list);
       // petData.insertPetDetailsUsingJson();
    }
    @Then("the new entry should be created")
    public void the_new_entry_should_be_created() {
      //  petData.getPetDetails();
    }

}
