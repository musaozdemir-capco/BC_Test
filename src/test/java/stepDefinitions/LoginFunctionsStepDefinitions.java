package stepDefinitions;

import io.cucumber.gherkin.internal.com.eclipsesource.json.PrettyPrint;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.MainLoginPageElements;
import utils.CommonMethods;
import utils.ConfigsReader;

public class LoginFunctionsStepDefinitions extends CommonMethods {

    @Given("I click Login button in login page")
    public void i_click_login_button_in_login_page() {

        click(main.mainPageLoginButton);

    }


    @When("I enter username as {string} and password as {string}")
    public void i_enter_username_as_and_password_as(String username, String password) {

        sendText(login.userNameTextBox, username);
        sendText(login.passwordTextBox, password);

    }


    @When("I click login button")
    public void i_click_login_button() {
        click(login.loginButton);

    }

    @Then("verify that {string} message displayed")
    public void verify_that_message_displayed(String allertMessage) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(allertMessage, login.allertMessage.getText());
//        System.out.println(login.userNameTextBox.getText());

    }


    @Then("verify that {string} displayed")
    public void verify_that_displayed(String allertMessage) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(allertMessage, login.allertMessage.getText());
    }

    @Given("I enter user name as {string} and password as {string}")
    public void i_enter_user_name_as_and_password_as(String username, String password) {
        sendText(login.userNameTextBox, username);
        sendText(login.passwordTextBox, password);
    }


    @Then("I verify greeting message {string} is displayed in dashboard")
    public void i_verify_greeting_message_is_displayed_in_dashboard(String message) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(message, dash.greetingMessage.getText());
    }

    @When("I click next button")
    public void i_click_next_button() {

    }

    @When("I click Next")
    public void i_click_next() {

    }


//----------------------------
//
//    @Then("verify that login must be unsuccessful")
//    public void verify_that_login_must_be_unsuccessful() {
//        Assert.assertTrue(login.loginButton.isDisplayed());
//    }
//
//    @When("I enter username as {string} and password as {string}")
//    public void i_enter_username_as_and_password_as(String username, String password) {
//        sendText(login.userNameTextBox, username);
//        sendText(login.passwordTextBox, password);
//    }
//
//    @Then("I should not able to click Log in button")
//    public void i_should_not_able_to_click_log_in_button() {
//        Assert.assertTrue(login.loginButton.isDisplayed());
//    }
//
//    @Given("I enter user name as {string}")
//    public void i_enter_user_name_as(String username) {
//        sendText(login.userNameTextBox, username);
//    }
//
//    @When("I enter password as {string}")
//    public void i_enter_password_as(String password) {
//        sendText(login.passwordTextBox, password);
//    }
//
//    @When("I click login button")
//    public void i_click_login_button() {
//        click(login.loginButton);
//    }
//
//    @Then("verify error message displayed")
//    public void verify_error_message_displayed() {
//        Assert.assertTrue(login.errorMessage.isDisplayed());
//    }
//
//    @Then("I verify greeting message is displayed in dashboard")
//    public void i_verify_greeting_message_is_displayed_in_dashboard() {
////        getWaitObject().until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class=\"greeting ng-star-inserted\"]")));
//        Assert.assertTrue(dash.greetingMessage.isDisplayed());
//    }

}
