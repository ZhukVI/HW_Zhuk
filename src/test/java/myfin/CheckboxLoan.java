package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckboxLoan {
    private static final By CHECKBOX_XPATH = By.xpath("//label[@for='check_consent']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/kredity/onlajn-zayavka");
        driver.findElement(CHECKBOX_XPATH);
        driver.quit();
    }
}
