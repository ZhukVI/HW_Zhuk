package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SocialMediaButton {

    private static final String MEDIA_BUTTON = "//a[@class = 'b-main-page-tabs__item'  and contains(text() ,'%s')]";

    @Test
    public  void findSocialMediaButton() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        driver.findElement(By.xpath(String.format(MEDIA_BUTTON, "Наши соцсети"))).click();
        //driver.quit();
    }
}


