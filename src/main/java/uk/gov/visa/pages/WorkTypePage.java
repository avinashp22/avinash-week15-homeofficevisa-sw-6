package uk.gov.visa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.gov.visa.utility.Utility;

public class WorkTypePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement selectJobTypeList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectJobType(String job){
        clickOnElement(selectJobTypeList);

    }
    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
    }
}
