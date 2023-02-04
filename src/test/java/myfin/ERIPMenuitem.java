package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ERIPMenuitem {
    private static final By ERIP_MENUITEM_XPATH = By.xpath("//a[contains(text(),'ЕРИП Платежи')]");
    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/");
        driver.findElement(ERIP_MENUITEM_XPATH);
        driver.quit();
    }
}
