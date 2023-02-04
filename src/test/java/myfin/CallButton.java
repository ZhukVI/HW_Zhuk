package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CallButton {
    private static final By CALL_BUTTON_XPATH = By.xpath("//div[contains(@class,'products-table__body')]//div[1]//div[1]//div[1]//div[1]//div[7]//div[2]//span[1]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/ekvajring/torgovyj/pos-terminal");
        driver.findElement(CALL_BUTTON_XPATH);
        driver.quit();
    }
}
