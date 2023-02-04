package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyfinEsLink {

    private static final By MYFIN_ES_LINK_XPATH = By.xpath("//span[contains(text(),'Myfin.es')]");

    @Test
    public  void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/");
        driver.findElement(MYFIN_ES_LINK_XPATH).click();
        driver.quit();
    }
}
