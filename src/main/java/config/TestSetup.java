package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestSetup {

    public static WebDriver driver;

    public static void setDriver(WebDriver driver){
        TestSetup.driver = driver;
    }

    protected void set(By locator, String text){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
}
