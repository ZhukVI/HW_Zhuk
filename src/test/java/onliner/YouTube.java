package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YouTube {

    private static final String YOUTUBE_ICON_XPATH = "//a[@class = 'footer-style__social-button footer-style_" +
            "_social-button_yt']";

    @Test
    public  void findYouTube() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        driver.findElement(By.xpath(YOUTUBE_ICON_XPATH)).click();
        driver.quit();
    }
}

