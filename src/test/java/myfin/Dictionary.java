package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dictionary {

    private static final By DICTIONARY_XPATH = By.xpath("//span[@class='alphabet-link-js a']" +
            "[contains(text(),'И')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/wiki/category/ekonomika");
        driver.findElement(DICTIONARY_XPATH);
        driver.quit();
    }
}
