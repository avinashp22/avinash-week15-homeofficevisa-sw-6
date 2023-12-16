package uk.gov.visa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.gov.visa.utility.Utility;

import java.util.List;

public class ReasonForTravelPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div//label")
    List<WebElement> reasonForVisitList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    public void selectReasonForVisit(String reason){
        for (WebElement e : reasonForVisitList){
            if (e.getText().contains(reason)){
                clickOnElement(e);
                break;
            }
        }
    }
    public void clickNextStepButton1(){
        clickOnElement(nextStepButton);

    }
}
