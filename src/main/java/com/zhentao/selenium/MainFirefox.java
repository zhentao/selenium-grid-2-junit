package com.zhentao.selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MainFirefox {
    public static void main(String[] args) throws MalformedURLException {
        URL hubUrl = new URL("http://localhost:4444/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox");
        capabilities.setPlatform(Platform.MAC);
        WebDriver driver = new RemoteWebDriver(hubUrl, capabilities);

        String baseUrl = "http://www.openx.com";
        driver.get(baseUrl);

        driver.findElement(By.linkText("Support")).click();
    }
}
