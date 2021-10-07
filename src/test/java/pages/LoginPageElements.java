package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.PageInitializer;

public class LoginPageElements extends PageInitializer {



    @FindBy(id = "login-account-name")
    public WebElement userNameTextBox;

    @FindBy(id = "login-account-password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//*[@class=\"btn btn-large btn-primary btn btn-icon-text ember-view\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"modal-alert\"]")
    public WebElement allertMessage;






public LoginPageElements(){
    PageFactory.initElements(driver , this);
}


}
