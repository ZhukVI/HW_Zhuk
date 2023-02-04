package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YesButton {

    private static final By YES_BUTTON_XPATH = By.xpath("//span[contains(text(),'Да')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/wiki/term/investicionnye-fondy");
        driver.findElement(YES_BUTTON_XPATH);
        driver.quit();
    }
}
