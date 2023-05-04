package Onpier.MyTaskTestFolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import static Onpier.DriverFactory.getChromeDriver;
import static Onpier.DriverFactory.getWebDriverWait;

public class BaseTestClass {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void startUpBrowser(){

        driver = getChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait = getWebDriverWait();
    }

    @BeforeMethod
    public void goToHome(){
        driver.get("https://thg-greenair.dev.wgv.onpier.de/landing");
    }

    @AfterSuite(alwaysRun = true)
    public void closeBrowser(){
        driver.close();
    }

}