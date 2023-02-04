package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WeatherIcon {

    private static final By WEATHER_ICON_XPATH = By.xpath("//a[@class='b-top-navigation-" +
            "informers__link']//i[@title='Погода в Минске']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        driver.findElement(WEATHER_ICON_XPATH);
        driver.quit();
    }
}
