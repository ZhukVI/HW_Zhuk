package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CurrencyRateMenu {
    private static final By CURRENCY_MENU_XPATH = By.xpath("//a[@class='main-nav_link " +
            "main-nav_link--straight'][contains(text(),'Курсы валют')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/");
        driver.findElement(CURRENCY_MENU_XPATH);
        driver.quit();
    }
}
