package uk.gov.visa.steps;

import io.cucumber.java.en.Then;
import uk.gov.visa.pages.SelectNationalityPage;

public class CountryDropDownSteps {


    @Then("I can see following {string}")
    public void iCanSeeFollowing(String country) {
        new SelectNationalityPage().selectNationality("country");
    }
}
