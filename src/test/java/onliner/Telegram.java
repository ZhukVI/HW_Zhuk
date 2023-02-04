package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Telegram {
    private static final By TELEGRAM_HYPERLINK_XPATH = By.xpath("//a[normalize-space()='Telegram']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://money.onliner.by/2022/12/16/ip-bez-uproshhenki");
        driver.findElement(TELEGRAM_HYPERLINK_XPATH);
        driver.quit();
    }
}
