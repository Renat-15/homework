import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import jdk.jfr.Description;
import org.example.steps.DriverInstance;
import org.example.steps.MtsPrivateClientsPageSteps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsTest {

    private MtsPrivateClientsPageSteps steps;
    private DriverInstance driverInstance; // Экземпляр DriverInstance
    private WebDriver driver;

    @BeforeEach
    public void setUp(){   //метод для настройки наших параметров, которые мы будем использовать
        driverInstance = new DriverInstance(); // Создаем новый экземпляр
        driver = driverInstance.getDriver(); // Получаем драйвер
        steps =  new MtsPrivateClientsPageSteps(driver);
        driver.manage().window().maximize(); // чтобы окно открывалось на максимальное разрешение на нашем компьютере
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.mts.by/");//метод, который открывает сайт
        WebElement acceptCookieButton = driver.findElement(By.id("cookie-agree"))   ; // метод until ждёт пока кнопка станет доступной
        if(acceptCookieButton != null && acceptCookieButton.isDisplayed()){ // если элемент найден на странице и виден
            acceptCookieButton.click(); // то выполняется клик по кнопке
        }
    }

    @AfterEach
    public void tearDown(){ // метод освобождения ресурсов
        if(driver != null){
            driver.quit(); // закрывает все окна браузера
        }
    }
    @Test
    @DisplayName("Checking 'Debt'")
    @Description("Тест проверки плейсхолдеров на полях для варина оплаты услуг 'Задолженность'")
    @Severity(SeverityLevel.MINOR)
    public void testPlaceholdersInDebt(){
        steps.openServicesDropdown().click();
        steps.selectDebt().click();
        steps.verifiedPhonePlaceholder("Номер счета на 2073");
        steps.verifiedAmountPlaceholder("Сумма");
        steps.verifiedEmailPlaceholder("E-mail для отправки чека");
    }
}
