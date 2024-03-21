import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateOtherDocsPage {
    WebDriver driver;
    WebDriverWait wait;
    public CreateOtherDocsPage(WebDriver driver){

        this.driver=driver;
    }
    String xPathOf_Exchange_a_Waiver = "//div[@class=\"left\" and contains(.,\"Exchange a Waiver\")]/following-sibling::div/descendant::span[text()='Free']";
    By xPathOfExchangeWaiverPrice = By.xpath(xPathOf_Exchange_a_Waiver);

    public String exchange_a_waiver_price(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(xPathOfExchangeWaiverPrice));
        String elemetPrice = driver.findElement(xPathOfExchangeWaiverPrice).getText();
        return elemetPrice;
    }

}
