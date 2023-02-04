package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BurgerMenuMoreHover {
    private static final String MORE_MENU_XPATH = "//span[@class ='main-nav_link' ][contains(text(), '%s')]";
    //пункты хедера Еще, Платежи, Бизнес

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/");
        driver.findElement(By.xpath(String.format(MORE_MENU_XPATH,"Еще")));
        driver.quit();
    }
}
