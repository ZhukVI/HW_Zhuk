package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NextPagesFlats {
    private static final By NEXT_PAGE_XPATH = By.xpath("//a[@class='pagination__main']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://r.onliner.by/pk/");
        driver.findElement(NEXT_PAGE_XPATH);
        driver.quit();
    }
}
