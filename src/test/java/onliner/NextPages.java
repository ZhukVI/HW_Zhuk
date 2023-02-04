package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NextPages {

    private static final By NEXT_PAGE_XPATH = By.xpath("//li[@class = 'next-page']");

    @Test
    public  void findNextPage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rating.onliner.by/");
        driver.findElement(NEXT_PAGE_XPATH).click();
        driver.quit();
    }
}
