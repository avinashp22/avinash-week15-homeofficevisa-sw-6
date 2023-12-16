package uk.gov.visa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.gov.visa.utility.Utility;

public class SelectNationalityPage extends Utility {


    @CacheLookup
    @FindBy(id = "response")
    WebElement nationalityDropDownList;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void selectNationality(String nationality){
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);

    }
    public void clickNextStepButton(){
        clickOnElement(continueButton);

    }
}
