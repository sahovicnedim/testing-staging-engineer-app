package org.selenium.pom.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.selenium.pom.constants.DriverType;

import java.time.Duration;

public class DriverManager {

    public WebDriver initializeDriver(String browser){

        WebDriver driver;
        String localBrowser;
        localBrowser = browser;
        switch(DriverType.valueOf(localBrowser)){
            case CHROME -> {
                WebDriverManager.chromedriver().cachePath("Drivers").setup();
                driver = new ChromeDriver();
            }
            case FIREFOX -> {
                WebDriverManager.firefoxdriver().cachePath("Drivers").setup();
                driver = new FirefoxDriver();
            }
            default ->  throw new IllegalStateException("Invalid browser name: " + browser);
        }

        driver.manage().window().maximize();
        return driver;
    }

}
