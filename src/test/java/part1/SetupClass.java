package part1;

import config.TestSetup;
import methods.BcgMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SetupClass {
    protected WebDriver driver;
    protected TestSetup testSetup;
    protected BcgMethods bcgMethods;

    private String url = "https://interviewqareact.azurewebsites.net/";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        testSetup = new TestSetup();
        bcgMethods = new BcgMethods();
        testSetup.setDriver(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
