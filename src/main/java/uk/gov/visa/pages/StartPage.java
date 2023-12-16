package uk.gov.visa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.gov.visa.utility.Utility;

public class StartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNowButton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Hide this message')]")
    WebElement hideTheMessage;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]")
    WebElement acceptCookies;

    public void clickStartNow(){
        clickOnElement(startNowButton);
    }
    public void acceptAllCookies(){
        clickOnElement(acceptCookies);
    }
    public void clickOnHideThisMessage (){
        clickOnElement(hideTheMessage);
    }
}
