package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkCopy {

    private static final By LINK_COPY_XPATH = By.xpath("//div[@class='flex flex--jc-c']" +
            "//span[@class='link-copy-btn__text'][contains(text(),'Скопировать ссылку на расчет')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/kredity/kalkulyator-zhilya");
        driver.findElement(LINK_COPY_XPATH);
        driver.quit();
    }
}
