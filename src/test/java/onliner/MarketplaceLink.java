package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MarketplaceLink {

    private static final By MARKETPLACE_LINK_XPATH = By.xpath("//li/a[contains(text()," +
            "'Компьютеры и серверы')]");

    @Test
    public  void findMarketplaceLink() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://baraholka.onliner.by/");
        driver.findElement(MARKETPLACE_LINK_XPATH).click();
        driver.quit();
    }
}
