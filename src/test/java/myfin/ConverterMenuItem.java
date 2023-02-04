package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConverterMenuItem {
    private static final By CONVERTER_MENU_XPATH = By.xpath("//li[@class='main-nav_sub-item']" +
            "//a[@class='main-nav_sub-link'][contains(text(),'Конвертер')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/");
        driver.findElement(CONVERTER_MENU_XPATH);
        driver.quit();
    }
}
