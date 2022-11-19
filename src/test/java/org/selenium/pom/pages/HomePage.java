package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class HomePage extends BasePage {

    private final By chooseBase = By.cssSelector("button[class='builderNowCta btnChoose']");
    private final By iconCancel = By.cssSelector("div[class='closeButton'] em[class='icon-cancel']");
    private final By closeButton = By.cssSelector(".natashPanelOverlay");
    private final By travel = By.cssSelector("body > app:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(1) > app-home-templates:nth-child(2) > div:nth-child(1) > div:nth-child(1) > perfect-scrollbar:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-template-filter:nth-child(2) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(14)");
    private final By social = By.cssSelector("body > app:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(1) > app-home-templates:nth-child(2) > div:nth-child(1) > div:nth-child(1) > perfect-scrollbar:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-template-filter:nth-child(2) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(13)");
    private final By sort = By.cssSelector(".filterSort");
    private final By sortName = By.cssSelector("body > app:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(1) > app-home-templates:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > app-sort:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > div:nth-child(1)");
    private final By viewDetails=By.cssSelector("body > app:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(1) > app-home-templates:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-home-template-card:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > a:nth-child(1)");
    private final By fullScreen = By.cssSelector(".share-wrapper");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage load(){
        load("/");
        return this;
    }

    public HomePage clickHereToChooseBase() {
        wait.until(ExpectedConditions.elementToBeClickable(chooseBase)).click();
        return this;
    }

    public HomePage clickIconCancel() {
        wait.until(ExpectedConditions.elementToBeClickable(iconCancel)).click();
        return this;
    }

    public HomePage clickCloseButton() {
        wait.until(ExpectedConditions.elementToBeClickable(closeButton)).click();
        return this;
    }

    public HomePage clickTravel() {
        wait.until(ExpectedConditions.elementToBeClickable(travel)).click();
        return this;
    }

    public HomePage clickSocial() {
        wait.until(ExpectedConditions.elementToBeClickable(social)).click();
        return this;
    }



    public HomePage clickSortButton(){
        wait.until(ExpectedConditions.elementToBeClickable(sort)).click();

        return this;
    }

    public HomePage clickSortName(){
        wait.until(ExpectedConditions.elementToBeClickable(sortName)).click();

        return this;
    }
    public HomePage clickViewDetails(){
        wait.until(ExpectedConditions.elementToBeClickable(viewDetails)).click();

        return this;
    }

    public HomePage clickFullScreen(){
        wait.until(ExpectedConditions.elementToBeClickable(fullScreen)).click();

        return this;
    }

}
