package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DescriptionAuto {

    private static final By DESCRIPTION_XPATH = By.xpath("//span[@class='vehicle-form__description vehicle-form__description_success vehicle-form__description_base']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ab.onliner.by/");
        driver.findElement(DESCRIPTION_XPATH);
        driver.quit();
    }

}
