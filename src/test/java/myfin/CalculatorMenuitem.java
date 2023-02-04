package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalculatorMenuitem {

    private static final By CALCULATOR_XPATH = By.xpath("//li[3]//div[1]//div[1]//div[2]//ul[1]//li[1]" +
            "//a[contains(text(), 'Калькулятор')]");
    //пыталась найти привычным способом, не получалось, только так нашло с помощью интернета

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/");
        driver.findElement(CALCULATOR_XPATH);
        driver.quit();
    }


}
