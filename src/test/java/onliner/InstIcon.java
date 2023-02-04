package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InstIcon {
    private static final By INSTAGRAM_ICON_XPATH = By.xpath("//span[@class='project-navigation__in']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://money.onliner.by/");
        driver.findElement(INSTAGRAM_ICON_XPATH);
        driver.quit();
    }
}
