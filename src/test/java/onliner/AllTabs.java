package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllTabs {
    private static final By ALL_TABS_XPATH = By.xpath("//a[contains(text(),'Все разделы Барахолки')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mb.onliner.by/");
        driver.findElement(ALL_TABS_XPATH);
        driver.quit();
    }
}
