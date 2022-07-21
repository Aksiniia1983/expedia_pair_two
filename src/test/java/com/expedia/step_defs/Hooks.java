package com.expedia.step_defs;


import com.expedia.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUpScenario(){
        System.out.println("-----> Before annotation: Setting up browser");
    }


    @After
    public void tearDownScenario(Scenario scenario){

        if (scenario.isFailed()) { // we are taking a screenshot only in case scenario is failed
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();

    }
}
