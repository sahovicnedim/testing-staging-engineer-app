package org.selenium.pom.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.pages.HomePage;
import org.selenium.pom.pages.InstagramPage;

import java.io.IOException;

public class TestCase extends BaseTest {

    @Test
    public void Test() {



        HomePage homePage = new HomePage(driver).
                load().
                clickHereToChooseBase().
                clickIconCancel().
                clickCloseButton().
                clickTravel().
                clickSocial().
                clickSortButton().
                clickSortName().clickViewDetails().clickFullScreen();
                InstagramPage instagramPage = new InstagramPage(driver);
                Assertions.assertEquals("iOS app for Apple (iPhones)",  instagramPage.getTitle());
                instagramPage.clickAddTemplateButton();

    }

}
