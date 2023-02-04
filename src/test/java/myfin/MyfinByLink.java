package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyfinByLink {
    private static final By MYFIN_BY_LINK_XPATH = By.xpath("//span[@class = 'footer-sites__text' and text() ='Myfin.by']");

    @Test
    public  void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.es/");
        driver.findElement(MYFIN_BY_LINK_XPATH).click();
        driver.quit();
    }
}
