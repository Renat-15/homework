import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.steps.DriverInstance;
import org.example.steps.MtsPrivateClientsPageSteps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.example.steps.DriverInstance.*;

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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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
    @DisplayName("Checking the block name")
    public void testCheckBlockTitle(){
        steps.scrpllToPaymentSectionTitle();
    }

    @Test
    @DisplayName("Checking the availability of payment system logos")
    public void testCheckLogos(){
        String[] expectedLogos = {"Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт"}; // массив названия логотипов

        for(String text: expectedLogos){
            assertTrue(steps.isLogoDisplayed(text));
        }
    }

    @Test
    @DisplayName("Link testing")
    public void testLinkService(){
        steps.clickMoreInfoLink();

        assertTrue(steps.isPaymentOrderDisplayed());
    }

    @Test
    @DisplayName("Checking the 'continue' button")
    public void testContinueButton(){
        steps.enterPhoneNumber("297777777");
        steps.enterAmount("100");
        steps.enterEmail("mail@mail.ru");
        steps.clickContinueButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // ожидание когда появится iframe
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='bepaid-iframe']")));
        // ожидание когда элемент станет доступен
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='pay-description__cost']//span[not(contains(@class,'pay-description__cost_converted'))]")));

        assertEquals("100.00 BYN", steps.getBynText().getText());
        assertTrue(steps.getBynText().isDisplayed());
        driver.switchTo().defaultContent();
    }
    @Test
    @DisplayName("Checking the 'Communication services'")
    public void testPlaceholdersInCommunicationservices(){
        assertEquals("Номер телефона", steps.getphoneNumberPlaceholder());
        assertEquals("Сумма", steps.getAmountPlaceholder());
        assertEquals("E-mail для отправки чека", steps.getEmailPlaceholder());
    }
    @Test
    @DisplayName("Checking the 'Home Internet'")
    public void testPlaceholdersInHomeInternet(){
        assertEquals("Номер абонента", steps.getSubscriberNumberPlaceholder());
        assertEquals("Сумма", steps.getAmountPlaceholder2());
        assertEquals("E-mail для отправки чека", steps.getEmailPlaceholder2());
    }
    @Test
    @DisplayName("Checking 'Installment'")
    public void testPlaceholdersInInterner(){
        assertEquals("Номер счета на 44", steps.getAccountNumberPlaceholder());
        assertEquals("Сумма", steps.getAmountPlaceholder3());
        assertEquals("E-mail для отправки чека", steps.getEmailPlaceholder3());
    }
    @Test
    @DisplayName("Checking 'Debt'")
    public void testPlaceholdersInDebt(){
        assertEquals("Номер счета на 2073", steps.getAccountNumberPlaceholder1());
        assertEquals("Сумма", steps.getAmountPlaceholder4());
        assertEquals("E-mail для отправки чека", steps.getEmailPlaceholder1());
    }
}
