package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Job {

    private static final By JOB_XPATH = By.xpath("//a[@title='PHP Developer']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://blog.onliner.by/vacancy");
        driver.findElement(JOB_XPATH);
        driver.quit();
    }
}
