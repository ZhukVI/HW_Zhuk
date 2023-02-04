package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FIOField {

    private static final By FIO_FIELD_XPATH = By.xpath("//input[@id = 'onl_fio']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/ekvajring/torgovyj/pos-terminal");
        driver.findElement(FIO_FIELD_XPATH);
        driver.quit();
    }
}
