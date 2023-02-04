package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginButton {
    private static final String LOGIN_BUTTON_XPATH = "//a[@class = 'footer-style__social-button " +
            "footer-style__social-button_yt']";

@Test
    public  void findLoginButton() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        driver.findElement(By.xpath(LOGIN_BUTTON_XPATH)).click();
        driver.quit();
    }
}
