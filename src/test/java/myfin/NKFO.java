package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NKFO {

    private static final By NKFO_XPATH = By.xpath("//a[@class='payments-list__list-item'][contains(text(),'Банки, НКФО')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/erip");
        driver.findElement(NKFO_XPATH);
        driver.quit();
    }
}
