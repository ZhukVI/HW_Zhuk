package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorBank {
    private static final By PRIORBANK_PAGE_XPATH = By.xpath("//a[contains(text(),'Приорбанк')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/erip/banki-nkfo");
        driver.findElement(PRIORBANK_PAGE_XPATH);
        driver.quit();
    }
}
