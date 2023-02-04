package onliner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VacanciesTab {

    private static final By VACANCIES_XPATH = By.xpath("//a[@class='footer-style__link footer-style__link_primary'][contains(text(),'Вакансии')]");

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://baraholka.onliner.by/");
        driver.findElement(VACANCIES_XPATH);
        driver.quit();
    }
}
