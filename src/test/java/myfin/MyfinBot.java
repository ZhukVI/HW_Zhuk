package myfin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyfinBot {
    private static final By BOT_XPATH = By.xpath("//body/div[@id='db']/div[@id='st-container']" +
            "/div[contains(@class,'st-pusher')]/div[contains(@class,'st-content')]/div[contains(@class," +
            "'outer-bg')]/div[contains(@class,'g-wrapper')]/div[contains(@class,'g-wrapper_i')]/div[contains" +
            "(@class,'g-main')]/div[contains(@class,'g-main_i background')]/div[contains(@class,'seo_wrap " +
            "background')]/div[contains(@class,'experement-container')]/div[contains(@class,'pt-20 bg-white')]/" +
            "section[contains(@class,'bg-white')]/div[@class='container']/div[contains(@class,'article')]" +
            "/div[@class='article__grid']/div[@class='article__main']/div[@class='article__content']" +
            "/div[@data-ga-experement='short-infinity-news']/div[@class='article__tg-container article__tg-" +
            "container--last']/div[@class='article__tg-container-text'][contains(text(),'Поделитесь своей " +
            "новостью или «денежной» историей ')]/span");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myfin.by/stati/view/skolko-poteral-bitkoin-i-drugie-kriptovaluty-smotrim-kursy-49");
        driver.findElement(BOT_XPATH);
        driver.quit();
    }
}
