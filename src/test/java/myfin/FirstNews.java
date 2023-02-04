package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstNews {

    private static final By FIRST_NEWS_XPATH = By.xpath("//div[contains(@class,'bg-white section--indent-bottom')]//a[@class='news-item-v2__link']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/stati");
        driver.findElement(FIRST_NEWS_XPATH);
        driver.quit();
    }
}
