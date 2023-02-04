package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BankDefinitionMenu {

    private static final By BANK_DEFINITION_MENUITEM_XPATH = By.xpath("//a[contains(text()," +
            "'Банковские термины')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/");
        driver.findElement(BANK_DEFINITION_MENUITEM_XPATH);
        driver.quit();
    }
}
