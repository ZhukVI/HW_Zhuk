package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EmailLoanField {
    private static final By EMAIL_XPATH = By.xpath("//input[@placeholder='name@mail.by']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/kredity/onlajn-zayavka");
        driver.findElement(EMAIL_XPATH);
        driver.quit();
    }
}
