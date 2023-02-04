package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrderCheckbox {
    private static final By ORDER_CHECKBOX_XPATH = By.xpath("//label[@for = 'check_consent']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/ekvajring/torgovyj/pos-terminal");
        driver.findElement(ORDER_CHECKBOX_XPATH);
        driver.quit();
    }
}
