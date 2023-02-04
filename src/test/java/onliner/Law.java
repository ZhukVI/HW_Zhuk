package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Law {
    private static final By LAW_TAB_XPATH = By.xpath("//a[contains(text(),'Законы')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://money.onliner.by/");
        driver.findElement(LAW_TAB_XPATH);
        driver.quit();
    }
}
