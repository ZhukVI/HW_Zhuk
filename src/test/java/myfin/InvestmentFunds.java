package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvestmentFunds {

    private static final By INVESTMENT_FUNDS_XPATH = By.xpath("//a[contains(text()," +
            "Инвестиционные фонды')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/wiki/category/ekonomika?letter=%D0%98");
        driver.findElement(INVESTMENT_FUNDS_XPATH);
        driver.quit();
    }
}
