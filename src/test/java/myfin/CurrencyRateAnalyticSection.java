package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CurrencyRateAnalyticSection {

    private static final By CURRENCY_RATE_ANALYTIC_SECTION_XPATH = By.xpath("//div[@class = " +
            "'c-section-wrapper']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/currency/minsk");
        driver.findElement(CURRENCY_RATE_ANALYTIC_SECTION_XPATH);
        driver.quit();
    }
}
