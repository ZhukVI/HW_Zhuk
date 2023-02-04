package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PurchaseTabs {
    private static final String PURCHASES_TABS = "//a[@class = 'catalog-bar__link catalog-bar__link_strong' " +
            "and contains( text(), '%s')]";

    @Test
    public  void findPurchaseTabs() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://catalog.onliner.by/");
        driver.findElement(By.xpath(String.format(PURCHASES_TABS, "Фены"))).click();
        driver.quit();
    }
}
