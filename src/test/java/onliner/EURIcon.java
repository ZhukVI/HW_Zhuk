package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EURIcon {
    private static final By EUR_ICON_XPATH = By.xpath("//a[contains(text(),'€')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mb.onliner.by/");
        driver.findElement(EUR_ICON_XPATH);
        driver.quit();
    }
}
