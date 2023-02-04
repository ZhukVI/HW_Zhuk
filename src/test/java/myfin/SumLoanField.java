package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SumLoanField {
    private static final By SUMMARY_FIELD_XPATH = By.xpath("//input[@name='Request[summa]']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/kredity/onlajn-zayavka");
        driver.findElement(SUMMARY_FIELD_XPATH);
        driver.quit();
    }
}
