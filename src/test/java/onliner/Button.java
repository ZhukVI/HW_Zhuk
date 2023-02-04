package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Button {

    private static final By BUTTON_XPATH = By.xpath("//div[@class = 'project-navigation__button'  and " +
            "contains(text(),'Разместить объявление')]");

    @Test
    public  void findButton() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ab.onliner.by/");
        driver.findElement(BUTTON_XPATH).click();
        driver.quit();
    }
}
