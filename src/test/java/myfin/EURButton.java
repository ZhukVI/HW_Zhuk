package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EURButton {

    private static final By EUR_BUTTON_XPATH = By.xpath("//div[contains(@class,'currencies-" +
            "chart-for-old-view__button')][normalize-space()='EUR']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/currency/minsk");
        driver.findElement(EUR_BUTTON_XPATH);
        driver.quit();
    }
}
