package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POSMenuItem {

    private static final By POS_MENUITEM_XPATH = By.xpath("//a[@href='/ekvajring/torgovyj/pos-terminal']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by");
        driver.findElement(POS_MENUITEM_XPATH);
        driver.quit();
    }
}
