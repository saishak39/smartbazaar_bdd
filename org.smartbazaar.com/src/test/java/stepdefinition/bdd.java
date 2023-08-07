package stepdefinition;

import browser.browser;
import excel.read;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.page1;
import screenshot.capture;

public class bdd {
    @Given("user open the browser")
    public void user_open_the_browser() throws Exception
    {
        try
        {
            browser.setUp();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
}
    @Then("user enters the {string}")
    public void user_enters_the(String string) throws Exception
    {
        try
        {
            browser.getUrl();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    @And("user clicks on the register and enters the data")
    public void user_clicks_on_the_register_and_enters_the_data() throws Exception
    {
        page1.searchTextBox(read.excel(1, 0));
        page1.searchTextBox1(read.excel1(1, 1));
    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() throws Exception
    {
        page1.searchTextBox2(read.excel2(1, 2));
    }

    @Then("user verify the result")
    public void user_verify_the_result() throws Exception
    {
        capture.screenShot(browser.properties("name"));
    }

    @And("user closes the browser")
    public void user_closes_the_browser() throws Exception
    {
        browser.closeBrowser();
    }


}
