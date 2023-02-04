package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrderHyperlinks {
    private static final By ORDER_LINK_XPATH = By.xpath("//a[@class = 'service-offers__details-item " +
            "service-offers__details-item_briefcase ng-binding ng-scope' and contains(text(),'Другие репетиторы')]");

    @Test
    public  void findOrderHyperlinks() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://s.onliner.by/tasks");
        driver.findElement(ORDER_LINK_XPATH).click();
        driver.quit();
    }
}
