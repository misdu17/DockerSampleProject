package com.syful.base;

import com.syful.utils.ReadPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    public static WebDriver driver;
    public static ReadPropertyFile myTestProperty = new ReadPropertyFile();
    private static final String operatingSystem = System.getProperty("os.name").toUpperCase();

    public static void main(String[] args) {
        System.out.println(operatingSystem);
    }



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
        if (operatingSystem.contains("MAC")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        } else if (operatingSystem.contains("WINDOWS")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver");
        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver initFirefoxDriver() {
        System.out.println("Launching Firefox browser..");
        if (operatingSystem.contains("MAC")){
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");;
        } else if (operatingSystem.contains("WINDOWS")){
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\geckodriver");;
        }
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
