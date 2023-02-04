package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrderDropdown {
    private static final String DROPDOWN = "//a[@class = 'service-form__link service-form__" +
            "link_alter service-form__link_base service-form__link_arrow_bottom ng-binding' " +
            "and text() = '%s']";

@Test
    public  void findOrderDropdown() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://s.onliner.by/tasks");
        driver.findElement(By.xpath(String.format(DROPDOWN,"Строительные и отделочные работы"))).click();
        driver.quit();
    }
}
