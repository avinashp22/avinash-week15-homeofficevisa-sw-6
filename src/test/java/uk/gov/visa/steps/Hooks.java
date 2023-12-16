package uk.gov.visa.steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import uk.gov.visa.propertyreader.PropertyReader;
import uk.gov.visa.utility.Utility;

public class Hooks extends Utility {
    @Before
    public void setUp () {
       selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
        final byte [] screenshot = getScreenShot();
        scenario.attach(screenshot, "image/png", scenario.getName());
        }
        closeBrowser();

}

    }
