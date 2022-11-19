package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class InstagramPage extends BasePage {

    private final By successNotice = By.cssSelector("div[class='includeBox platforms'] div:nth-child(1) div:nth-child(2) p:nth-child(1)");
    private final By addTemplate = By.cssSelector("button[title='Add template']");
    public InstagramPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successNotice)).getText();

    }

    public InstagramPage clickAddTemplateButton(){
        wait.until(ExpectedConditions.elementToBeClickable(addTemplate)).click();

        return this;
    }



}
