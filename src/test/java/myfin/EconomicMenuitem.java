package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EconomicMenuitem {

    private static final By ADD_CURRENCY_BUTTON_XPATH = By.xpath("//a[@href='https://myfin.by/wiki" +
            "/category/ekonomika']");
    //здесь уникальный элемент только href, другое не нашла

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/wiki");
        driver.findElement(ADD_CURRENCY_BUTTON_XPATH);
        driver.quit();
    }
}
