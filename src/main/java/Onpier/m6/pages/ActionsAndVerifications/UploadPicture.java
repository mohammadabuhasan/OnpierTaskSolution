package Onpier.m6.pages.ActionsAndVerifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Onpier.DriverFactory.getChromeDriver;

public class UploadPicture {
    private MyTestActController act;
    private MyTestVerifyController verify;

    public MyTestActController act(){
        return act;
    }

    public MyTestVerifyController verify(){
        return verify;
    }

    private WebDriver driver = getChromeDriver();

    private UploadPicture(){
        // hide it
    }

    private UploadPicture(MyTestActController act, MyTestVerifyController verify){
        this.act = act;
        this.verify = verify;
    }
    public static UploadPicture getUploadPicture(){
        return new UploadPicture(new MyTestActController(),
                new MyTestVerifyController());
    }

    public static By Formlabel(){
        return By.cssSelector("form>label:nth-child(2)");
    }
}
