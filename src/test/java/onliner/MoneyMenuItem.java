package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MoneyMenuItem {

   private static final String MONEY_MENU_ITEM = "//span[@class = 'project-navigation__sign' and text() = '%s']";

    @Test
    public  void findMoneyMenuElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://money.onliner.by/");
        driver.findElement(By.xpath(String.format(MONEY_MENU_ITEM, "Люди"))).click();
        driver.quit();
    }
}
