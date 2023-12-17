package uk.gov.visa.pages;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import uk.gov.visa.utility.Utility;

public class FamilyImmigrationStatus extends Utility {
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatus.class.getName());

    public FamilyImmigrationStatus() {
        PageFactory.initElements(driver, this);
    }

}
