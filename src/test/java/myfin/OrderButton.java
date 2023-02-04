package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrderButton {
    private static final By ORDER_BUTTON_XPATH = By.xpath("//a[@id = 'modal-product-bt']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/ekvajring/torgovyj/pos-terminal");
        driver.findElement(ORDER_BUTTON_XPATH);
        driver.quit();
    }
}
