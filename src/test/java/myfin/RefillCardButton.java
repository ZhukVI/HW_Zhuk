package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RefillCardButton {

    private static final By REFILL_CARD_BUTTON_XPATH = By.xpath("//a[contains(text(),'Пополнение " +
            "платежной карточки')]//span[contains(@class,'btn btn-default')][contains(text(),'Оплатить')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/erip/priorbank");
        driver.findElement(REFILL_CARD_BUTTON_XPATH);
        driver.quit();
    }
}
