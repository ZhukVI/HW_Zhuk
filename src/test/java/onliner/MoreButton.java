package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MoreButton {
    private static final By MORE_INFO_BUTTON_XPATH = By.xpath("//span[@class='news-more__text']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://money.onliner.by/");
        driver.findElement(MORE_INFO_BUTTON_XPATH);
        driver.quit();
    }
}
