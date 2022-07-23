package com.expedia.step_defs;

import com.expedia.pages.BasePage;
import com.expedia.pages.SearchResultPage;
import com.expedia.utilities.BrowserUtils;
import com.expedia.utilities.ConfigurationReader;
import com.expedia.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class SearchResultVerificationStepDefs {

    BasePage basePage = new BasePage();
    BrowserUtils browserUtils = new BrowserUtils();
    SearchResultPage searchResultPage = new SearchResultPage();

    //-------------------Vugar------------------------
    @Given("User on on the expedia home page") //
    public void user_on_on_the_expedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("expediaURL"));
    }

    @When("User clicks on flight button")
    public void user_clicks_on_flight_button() {
        basePage.flights.click();
        browserUtils.verifyTitle(Driver.getDriver(), "Expedia Travel: Vacation Homes, Hotels, Car Rentals, Flights & More");
    }


    @When("types {string} in the Leaving from search box and clicks enter button")
    public void types_in_the_leaving_from_search_box_and_clicks_enter_button(String leaving) {
        basePage.leavingFrom.click();
        basePage.leavingFromInput.sendKeys(leaving + Keys.ENTER);
    }

    @When("types {string} in Going to search box and clicks enter button")
    public void types_in_going_to_search_box_and_clicks_enter_button(String going) {
        basePage.goingTo.click();
        basePage.goingToInput.sendKeys(going + Keys.ENTER);
    }

    // ----------------------Vugar----------------------
    @When("Chooses {string} as a departure date and {string} as a returning date")
    public void chooses_as_a_departure_date_and_as_a_returning_date(String departDate, String returnDate) {
        basePage.dateTable.click();
        basePage.selectDate(departDate);
        basePage.selectDate(returnDate);
        basePage.doneBtn.click();

    }

    @When("Clicks search button")
    public void clicks_search_button() {
        basePage.search.click();
    }
    //------------------Azad--------------------------

   @When("User is redirected  to the search result page")
    public void user_is_redirected_to_the_search_result_page() throws InterruptedException {
        Thread.sleep(50000);

        BrowserUtils.verifyTitle(Driver.getDriver(),"DCA to CMH flights");
    }

    //-----------------------Nijat------------------------

    @When("User verifies that {string} is chosen from the dropdown by default")
    public void user_verifies_that_is_chosen_from_the_dropdown_by_default(String string) {
    }


    //-------------------------Ferdon------------------------
    @Then("User verifies that the lowest price flight shows on top of the list")
    public void user_verifies_that_the_lowest_price_flight_shows_on_top_of_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    // --------------------Aksiniia--------------------------




}
