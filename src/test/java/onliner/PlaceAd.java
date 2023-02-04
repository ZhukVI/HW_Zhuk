package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PlaceAd {
    private static final By PLACE_AD_BUTTON_XPATH = By.xpath("//a[contains(text(),'Все разделы Барахолки')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mb.onliner.by/");
        driver.findElement(PLACE_AD_BUTTON_XPATH);
        driver.quit();
    }
}
