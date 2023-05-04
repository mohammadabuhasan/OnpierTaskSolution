package Onpier.m6.pages.ActionsAndVerifications;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Onpier.DriverFactory.getChromeDriver;
import static Onpier.DriverFactory.getWebDriverWait;
import static Onpier.m6.utils.TestUtils.explicitWait;

public class MyTestActController {
    WebDriver driver = getChromeDriver();
    WebDriverWait wait = getWebDriverWait();

    public MyTestActController scrollToUpload() {
        WebElement element = driver.findElement(By.cssSelector("form>label:nth-child(2)"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        explicitWait();
        return this;

    }

    public MyTestActController clickSecondLabel() {
        WebElement element = driver.findElement(By.cssSelector("form>label:nth-child(2)"));
        element.click();
        explicitWait();

 return this;
    }

    public MyTestActController clickApplyForBouns() {
        ((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
        WebElement element = driver.findElement(By.cssSelector("mat-card button"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        explicitWait();
        element.click();
        explicitWait();
        return this;
    }

    public MyTestActController UploadImages(int index) throws Exception {
        ((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
        explicitWait();
        WebElement element = driver.findElements(By.cssSelector("div[appdragdropfileupload] input[name=\"file-upload\"]")).get(index);
        element.sendKeys("C:\\Users\\moham\\OneDrive\\Desktop\\automated-tests-in-java-with-fluent-interface-using-webdriver-selenium-exercise-files\\8666791_loader_loading_icon.png");

        Thread.sleep(1000);
        explicitWait();
        return this;
    }

    public MyTestActController clickRemoveImage() {
        WebElement element = driver.findElement(By.cssSelector("button[aria-label=\"delete icon\"]"));
        element.click();
        explicitWait();
        return this;

    }

    public MyTestActController clickNext(int step) {
        WebElement element = driver.findElements(By.cssSelector("button[mat-flat-button] ")).get(step);
        element.click();
        explicitWait();
        explicitWait();
        return this;
    }

    public MyTestActController selectSalutation(String selectedOption) {
        explicitWait();
        WebElement element = driver.findElement(By.xpath("//mat-select"));
        element.click();
        explicitWait();
        WebElement selectedOptionElement = driver.findElement(By.xpath("//mat-option/span[contains(text(),'" + selectedOption + "')]"));
        explicitWait();
        selectedOptionElement.click();
        explicitWait();
 return this;
    }

    public MyTestActController selectType(String type) {
        WebElement radio = driver.findElement(By.xpath("//input[@value='" + type +"']"));
        radio.click();
        explicitWait();
        return this;
    }
    public MyTestActController setFirstName(String name){
        WebElement element = driver.findElement(By.cssSelector("onpier-input[label=\"Vorname\"] input"));
        element.sendKeys(name);
        return this;
    }

    public MyTestActController setLastName(String name){
        WebElement element = driver.findElement(By.cssSelector("onpier-input[label=\"Nachname\"] input"));
        element.sendKeys(name);
        return this;
    }
    public MyTestActController setEmailAddress(String name){
        WebElement element = driver.findElement(By.cssSelector("onpier-input[label=\"E-Mail-Adresse\"] input"));
        element.sendKeys(name);
        return this;
    }
    public MyTestActController setAccountOwner(String name){
        WebElement element = driver.findElement(By.cssSelector("onpier-input[label=\"Kontoinhaber\"] input"));
        element.sendKeys(name);
        return this;
    }

    public MyTestActController setIBAN(String name){
        WebElement element = driver.findElement(By.cssSelector("onpier-input[label=\"IBAN\"] input"));
        element.sendKeys(name);
        return this;
    }
public  MyTestActController clickCheckboxs(int index){
    WebElement element = driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).get(index);
    element.click();
    explicitWait();
    return this;
    }

    public MyTestActController fillInfo(String FirstName,String LastName,String Email,String AccountOwner,String IBAN ){

        setFirstName(FirstName);
        explicitWait();
        setLastName(LastName);
        explicitWait();
        setEmailAddress(Email);
        explicitWait();
        setAccountOwner(AccountOwner);
        explicitWait();
        setIBAN(IBAN);
        explicitWait();
        return this;
    }
}