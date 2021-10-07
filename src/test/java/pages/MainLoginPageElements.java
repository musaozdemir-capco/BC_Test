package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.PageInitializer;

public class MainLoginPageElements extends PageInitializer {


    @FindBy(xpath = "//*[@class=\"widget-button btn btn-primary btn-small login-button btn-icon-text\"]")
    public WebElement mainPageLoginButton;


    public MainLoginPageElements() {
        PageFactory.initElements(driver, this);
    }


}