package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KronaCurrency {

    private static final By ADD_CURRENCY_XPATH = By.xpath("//span[@class='nbrbczk']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/converter");
        driver.findElement(ADD_CURRENCY_XPATH);
        driver.quit();
    }
}
