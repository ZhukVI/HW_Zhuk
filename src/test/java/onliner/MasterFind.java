package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MasterFind {
    private static final By FIND_MASTER_XPATH = By.xpath("//div[@class='b-main-navigation__bubble " +
            "b-main-navigation__bubble_another']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://money.onliner.by/");
        driver.findElement(FIND_MASTER_XPATH);
        driver.quit();
    }
}
