package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EmailField {
    private static final By EMAIL_FIELD_XPATH = By.xpath("//input[@id = 'email-subscribers']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/erip/priorbank");
        driver.findElement(EMAIL_FIELD_XPATH);
        driver.quit();
    }


}
