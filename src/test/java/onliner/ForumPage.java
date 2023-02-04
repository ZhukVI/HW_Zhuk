package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ForumPage {

    private static final String FORUM_PAGE = "//span[@class = 'b-navonsubj']/a[text()='%s']";

    @Test
    public  void findForumPage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://forum.onliner.by/");
        driver.findElement(By.xpath(String.format(FORUM_PAGE, "7"))).click();
        driver.quit();
    }
}
