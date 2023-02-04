package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PayLoanButton {
    private static final By PAY_LOAN_BUTTON_XPATH = By.xpath("//a[contains(text(),'Погашение кредита')]//span[@class='btn btn-default'][contains(text(),'Оплатить')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/erip/priorbank");
        driver.findElement(PAY_LOAN_BUTTON_XPATH);
        driver.quit();
    }
}
