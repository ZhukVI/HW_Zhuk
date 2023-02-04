package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Color {

    private static final By COLOR_XPATH = By.xpath("//li[@title='Белый']//div[@class='vehicle-form__checkbox-text']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ab.onliner.by/");
        driver.findElement(COLOR_XPATH);
        driver.quit();
    }

}
