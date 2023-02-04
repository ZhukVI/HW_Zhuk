package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SuperPrice {

    private static final By SUPERPRICE_XPATH = By.xpath("//a[@class = 'catalog-navigation__bubble " +
            "catalog-navigation__bubble_primary']");

    @Test
    public  void findSuperPrice() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://catalog.onliner.by/");
        driver.findElement(SUPERPRICE_XPATH).click();
        driver.quit();
    }
}
