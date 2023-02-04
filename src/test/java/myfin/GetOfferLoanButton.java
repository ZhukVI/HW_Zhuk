package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetOfferLoanButton {
    private static final By GET_OFFER_BUTTON_XPATH = By.xpath("//div[@class='btn btn-default " +
            "btn--full pre-check-form']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/kredity/onlajn-zayavka");
        driver.findElement(GET_OFFER_BUTTON_XPATH);
        driver.quit();
    }
}
