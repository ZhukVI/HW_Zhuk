package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CurrencyRateHeaderItem {

    private static final By CURRENCY_RATE_HEATER_MENU_ITEM_XPATH = By.xpath("//a[@class='main-nav_sub-title'][contains(text(),'Курсы валют')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/");
        driver.findElement(CURRENCY_RATE_HEATER_MENU_ITEM_XPATH);
        driver.quit();
    }
}
