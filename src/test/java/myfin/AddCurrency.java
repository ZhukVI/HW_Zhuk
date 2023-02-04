package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddCurrency {
    private static final By ADD_CURRENCY_BUTTON_XPATH = By.xpath("//body/div[@id='db']" +
            "/div[@id='st-container']/div[@class='st-pusher']/div[@class='st-content']/div[@class='outer-bg']" +
            "/div[@class='g-wrapper']/div[@class='g-wrapper_i']/div[@class='g-main']/div[@class='g-main_i " +
            "background']/div[@class='seo_wrap background']/div[@id='content_container']/div[@class='row']" +
            "/div[@class='col-md-9 main-container']/div[@class='content-i']/div[@class='content-i__wrapper']" +
            "/div[@class='converter-containers converter-containers--tablet-col-2']/div[@class='converter-" +
            "container converter-container-in-grid converter-container--dark']/div[@class='converter-container_" +
            "_content']/div[@class='converter-container__select mt-20']/div[@class='selectric-container selectric" +
            "-container--like-link selectric-container--icon-plus']/div[@class='selectric-wrapper selectric-" +
            "selectValute']/div[@class='selectric']/span[1]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/converter");
        driver.findElement(ADD_CURRENCY_BUTTON_XPATH).click();
        driver.quit();
    }
}
