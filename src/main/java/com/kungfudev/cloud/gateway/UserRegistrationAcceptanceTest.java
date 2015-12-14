package com.kungfudev.cloud.gateway;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

/**
 * User: Kevin W. Sewell
 * Date: 2015-06-14
 * Time: 17h49
 */
public class UserRegistrationAcceptanceTest {

    @Test
    public void shouldRegisterUser() {

        WebDriver webDriver = new FirefoxDriver();
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 5000);

        webDriver.navigate().to("http://localhost:8000");

        webDriverWait
                .until(elementToBeClickable(By.cssSelector("form.kdc-user-registration div.kdc-first-name input")))
                .sendKeys("Kevin");

        webDriverWait
                .until(elementToBeClickable(By.cssSelector("form.kdc-user-registration div.kdc-last-name input")))
                .sendKeys("Sewell");

        webDriverWait
                .until(elementToBeClickable(By.cssSelector("form.kdc-user-registration div.kdc-email-address input")))
                .sendKeys("kevin.sewell@aronim.com");

        webDriverWait
                .until(elementToBeClickable(By.cssSelector("form.kdc-user-registration div.kdc-password input")))
                .sendKeys("P@ssw0rd");

        webDriverWait
                .until(elementToBeClickable(By.cssSelector("form.kdc-user-registration button.kdc-register")))
                .click();
    }
}
