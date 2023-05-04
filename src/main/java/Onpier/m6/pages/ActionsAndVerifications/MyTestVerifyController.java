package Onpier.m6.pages.ActionsAndVerifications;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static Onpier.DriverFactory.getChromeDriver;

public class MyTestVerifyController {
    private WebDriver driver = getChromeDriver();

    public MyTestVerifyController NavigationToUploadPage() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://thg-greenair.dev.wgv.onpier.de/onboarding");
        return this;
    }
    public MyTestVerifyController NavigationToCompletePage() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://thg-greenair.dev.wgv.onpier.de/complete");
        return this;
    }

}
