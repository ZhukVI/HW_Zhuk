package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BurgerMenuHover {

    private static final String HOVER_MENU_XPATH = "//a[@class ='main-nav_link main-nav_link-" +
            "-straight'][contains(text(), '%s')]";
    //пункты хедера Курсы валют, Новости, Кредиты, Вклады, Карты, Переводы, Облигации

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/");
        driver.findElement(By.xpath(String.format(HOVER_MENU_XPATH, "Курсы валют")));
        driver.quit();
    }
}
