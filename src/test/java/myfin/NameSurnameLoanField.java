package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NameSurnameLoanField {

    private static final By NAME_LOAN_FIELD_XPATH = By.xpath("//input[@placeholder='Иван Иванов']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/kredity/onlajn-zayavka");
        driver.findElement(NAME_LOAN_FIELD_XPATH);
        driver.quit();
    }
}
