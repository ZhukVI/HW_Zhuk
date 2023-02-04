package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MapElements {

    private static final By MAP_ELEMENT_XPATH = By.xpath("//div[@class='arenda-map__control arenda-map__control_fullscreen']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://r.onliner.by/pk/");
        driver.findElement(MAP_ELEMENT_XPATH);
        driver.quit();
    }
}
