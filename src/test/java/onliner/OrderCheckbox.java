package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrderCheckbox {

    private static final By CHECKBOX_XPATH = By.xpath("//span[@class = 'i-checkbox service-form_" +
            "_checkbox service-form__checkbox_base']/span[@class = 'service-form__checkbox-text']/span[@class =" +
            " 'service-form__checkbox-sign ng-binding' and contains(text(), 'Минская область')]");

    @Test
    public  void findOrderCheckbox() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://s.onliner.by/tasks");
        driver.findElement(CHECKBOX_XPATH).click();
        driver.quit();
    }
}
