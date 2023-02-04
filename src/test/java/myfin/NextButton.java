package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NextButton {
    private static final By NEXT_BUTTON_XPATH = By.xpath("//button[@class='btn btn-primary " +
            "email-subscribe__btn']");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/erip/priorbank");
        driver.findElement(NEXT_BUTTON_XPATH);
        driver.quit();
    }
}
