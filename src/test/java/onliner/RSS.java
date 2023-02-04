package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RSS {
    private static final By RSS_ITEM_XPATH = By.xpath("//a[text()='Авто']//..//..//a[@title='RSS']");

    @Test
    public  void findRSS() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        WebElement footerItem = driver.findElement(RSS_ITEM_XPATH);
        footerItem.click();
        driver.quit();
    }
}
