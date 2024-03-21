import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    String levelSet_HomePage = "https://www.levelset.com/";
    String getPaid = "//a[contains(.,\"Get paid \")]";
    By xpathOfGetPaid = By.xpath(getPaid);
    WebDriver driver;
    WebDriverWait wait;
    Actions act;
    public HomePage(WebDriver driver){

        this.driver=driver;
    }
    public void navigateToHome(){
        driver.get(levelSet_HomePage);
        WebElement expectedElement = driver.findElement(xpathOfGetPaid);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(expectedElement));
    }


    public CreateOtherDocsPage clickOnGetPaid(){
        WebElement getPaidButton=driver.findElement(xpathOfGetPaid);
        //act = new Actions(driver).moveToElement(getPaidButton);
        //driver.findElement(xpathOfGetPaid).click();
        //driver.findElement(xpathOfGetPaid).click();
        getPaidButton.click();
        getPaidButton.click();

        return new CreateOtherDocsPage(driver);
    }
}
