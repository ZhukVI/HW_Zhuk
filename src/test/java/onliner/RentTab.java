package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RentTab {

    private static final By RENT_TAB_XPATH = By.xpath("//li[@class='project-navigation__item project-navigation__item_primary']//span[@class='project-navigation__text']//span[1]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://r.onliner.by/pk/");
        driver.findElement(RENT_TAB_XPATH);
        driver.quit();
    }
}
