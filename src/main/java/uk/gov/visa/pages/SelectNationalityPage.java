package uk.gov.visa.pages;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.gov.visa.utility.Utility;

public class SelectNationalityPage extends Utility {


    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(tagName = "select")
    WebElement selectNationality;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    @CacheLookup
    @FindBy (xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    public void selectNationalityFromDropDown(String nationality) {
        log.info("Selecting nationality from drop down: " + selectNationality.toString());
        selectByVisibleTextFromDropDown(selectNationality, nationality);
    }

    public void clickOnContinueButton() {
        log.info("Clicking on continue button: " + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void selectNationality(String nationality) {
        log.info("Select Nationality");
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);

}
}
