package com.openx.adquality.selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserTest {

    @Test
    public void testSafari() throws MalformedURLException, InterruptedException {
        URL hubUrl = new URL("http://localhost:4444/wd/hub");
        DesiredCapabilities capabilities = DesiredCapabilities.safari();
        capabilities.setPlatform(Platform.MAC);
        WebDriver driver = new RemoteWebDriver(hubUrl, capabilities);

        String baseUrl = "http://www.openx.com";
        driver.get(baseUrl);

        driver.findElement(By.linkText("Support")).click();
        driver.close();
        driver.quit();
    }

    @Test
    public void testFirefox() throws MalformedURLException, InterruptedException {
        URL hubUrl = new URL("http://localhost:4444/wd/hub");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setPlatform(Platform.MAC);
        WebDriver driver = new RemoteWebDriver(hubUrl, capabilities);

        String baseUrl = "http://www.openx.com";
        driver.get(baseUrl);

        driver.findElement(By.linkText("Support")).click();
        driver.close();
        driver.quit();
    }

    @Test
    public void testChrome() throws MalformedURLException, InterruptedException {
        URL hubUrl = new URL("http://localhost:4444/wd/hub");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setPlatform(Platform.MAC);
        WebDriver driver = new RemoteWebDriver(hubUrl, capabilities);

        String baseUrl = "http://www.openx.com";
        driver.get(baseUrl);

        driver.findElement(By.linkText("Support")).click();
        driver.close();
        driver.quit();
    }

}
