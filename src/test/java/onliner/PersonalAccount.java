package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PersonalAccount {
    private static final By PERSONAL_BANK_ACCOUNT_XPATH = By.xpath("//a[contains(text(),'Личный счет')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://money.onliner.by/2022/12/16/ip-bez-uproshhenki");
        driver.findElement(PERSONAL_BANK_ACCOUNT_XPATH);
        driver.quit();
    }
}
