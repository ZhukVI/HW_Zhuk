package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Price {
    private static final By ELECTRO_CHECKBOX_XPATH = By.xpath("//div[@class='vehicle-form__row vehicle" +
            "-form__row_condensed-alter']//input[@placeholder='от']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ab.onliner.by/");
        driver.findElement(ELECTRO_CHECKBOX_XPATH);
        driver.quit();
    }
}
