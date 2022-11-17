package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;

public class Hooks {

    DriverManager drivermanager=new DriverManager();

    @Before // Please make sure, it should be taken from cucumber.,junit
    public void setUp() throws IllegalAccessException {
        drivermanager.runOnLocalBrowser();
        drivermanager.goToURL();
        drivermanager.maxBrowser();
        drivermanager.applyImplicitWait();
    }

    @After //Please make sure, it should be taken from Cucumber.junit
    public void tearDown(){
        drivermanager.closeBrowser();
    }
}
