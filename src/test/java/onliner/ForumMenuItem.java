package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ForumMenuItem {

 private static final String FORUM_ITEM_XPATH = "//li/a[contains(text(),'%s')]";

    @Test
    public  void findForumMenuItem() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        driver.findElement(By.xpath(String.format(FORUM_ITEM_XPATH, "Выбор и настройка компьютера (3)"))).click();
        driver.quit();
    }

}

