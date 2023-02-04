package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Wallet {

    private static final By WALLET_XPATH = By.xpath("//div[@id='widget-9-1']//a[@class='b-tile-section'][contains(text(),'Кошелек')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        driver.findElement(WALLET_XPATH);
        driver.quit();
    }
}
