package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActualInfoDropdown {

    private static final By ACTUAL_DROPDOWN_XPATH = By.xpath("//div[@class='dropdown__value'][normalize-space()='']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://r.onliner.by/pk/");
        driver.findElement(ACTUAL_DROPDOWN_XPATH);
        driver.quit();
    }
}
