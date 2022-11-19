package org.selenium.pom.base;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.factory.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void startDriver() {
        String browser ="FIREFOX";
        driver = new DriverManager().initializeDriver(browser);
    }


    @AfterEach
    public void quitDriver() {
        driver.quit();
    }

}
