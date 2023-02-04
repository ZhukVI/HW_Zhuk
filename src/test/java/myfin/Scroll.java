package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {
    private static final By SCROLL_XPATH = By.xpath("//div[@class='amcharts-chart-div']" +
            "//*[name()='svg']//*[name()='g']//*[name()='g' and contains(@visibility,'visible')]" +
            "//*[name()='g'][3]/*[name()='rect']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/currency/minsk");
        driver.findElement(SCROLL_XPATH);
        driver.quit();
    }
}
