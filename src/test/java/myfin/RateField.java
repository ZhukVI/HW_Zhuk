package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RateField {
    private static final By RATE_FIELD_XPATH = By.xpath("//form[@id='credit-calculator-form']" +
            "//input[@id='creditslistcalczhileform-rate']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/kredity/kalkulyator-zhilya");
        driver.findElement(RATE_FIELD_XPATH);
        driver.quit();
    }
}
