package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OnlineLoanForm {
    private static final By ONLINE_LOAN_FORM_XPATH = By.xpath("//a[@class = 'pb-15 pt-15 pr-15 pl-15']//..");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/currency/minsk");
        driver.findElement(ONLINE_LOAN_FORM_XPATH);
        driver.quit();
    }
}
