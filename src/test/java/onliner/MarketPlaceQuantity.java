package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MarketPlaceQuantity {

    private static final By QUANTITY_XPATH = By.xpath("//li/sup[contains(text(), '841')]");

    @Test
    public  void findMarketPlaceQuantity() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://baraholka.onliner.by/");
        driver.findElement(QUANTITY_XPATH).click();
        driver.quit();
    }
}
