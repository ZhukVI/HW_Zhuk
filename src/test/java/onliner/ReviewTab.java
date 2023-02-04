package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReviewTab {
    private static final By REVIEW_TAB_XPATH = By.xpath("//span[@class='project-navigation__sign'][contains(text(),'Отзывы об авто')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ab.onliner.by/");
        driver.findElement(REVIEW_TAB_XPATH);
        driver.quit();
    }
}
