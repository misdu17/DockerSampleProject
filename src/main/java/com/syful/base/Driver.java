package com.syful.base;

import com.syful.utils.ReadPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    public static WebDriver driver;
    public static ReadPropertyFile myTestProperty = new ReadPropertyFile();

    public void setDriver(String browserType) {
        if (browserType.equals("chrome")) {
            driver = initChromeDriver();

        } else if (browserType.equals("firefox")) {
            driver = initFirefoxDriver();

        } else {
            System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
            driver = initFirefoxDriver();
        }
    }

    public WebDriver initChromeDriver() {
        System.out.println("Launching google chrome with new profile..");
        System.setProperty("webdriver.chrome.driver", "/Users/Zakia/IntelliJProjects/DockerSampleProject/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver initFirefoxDriver() {
        System.out.println("Launching Firefox browser..");
        System.setProperty("webdriver.gecko.driver", "/Users/Zakia/IntelliJProjects/DockerSampleProject/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
