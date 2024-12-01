import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsTest {

    private WebDriver driver; // веб драйвер подключается для того, чтобы эмулировать запуск браузера
    private WebDriverWait wait;

    @BeforeEach
    public void setUp(){   //метод для настройки наших параметров, которые мы будем использовать
        WebDriverManager.chromedriver().setup(); // он будет смотреть какой версии браузер и автоматически скачивать ту версию драйвера, которой у меня браузер. чтобы они совпадали
        driver = new ChromeDriver(); // создаём хром драйвер
        driver.manage().window().maximize(); // чтобы окно открывалось на максимальное разрешение на нашем компьютере
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // тоже самое ожидание но только чуть более корявое
        driver.get("https://www.mts.by/");//метод, который открывает сайт
        WebElement acceptCookieButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cookie-agree"))); // метод until ждёт пока кнопка станет доступной
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
        WebElement blockPaymentSectionTitle = driver.findElement(By.xpath("//section[@class='pay']//h2[contains(text(), 'Онлайн пополнение') and " +
                "contains(., 'без комиссии')]"));
        assertTrue(blockPaymentSectionTitle.isDisplayed());
    }

    @Test
    @DisplayName("Checking the availability of payment system logos")
    public void testCheckLogos(){
        WebElement logos = driver.findElement(By.xpath("//div[@class='pay__partners']//ul")); //  список логотипов
        String[] expectedLogos = {"Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт"}; // массив названия логотипов

        for(String text: expectedLogos){
            WebElement logo = logos.findElement(By.xpath(".//img[@alt='" + text + "']"));
            assertTrue(logo.isDisplayed());
        }
    }

    @Test
    @DisplayName("link testing")
    public void testLinkService(){
        WebElement moreInfoLink = driver.findElement(By.xpath("//section[@class='pay']//a[contains(text(), 'Подробнее о сервисе')]"));
        moreInfoLink.click();

        // Вариан сверки URL:
        //assertTrue(driver.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
        WebElement payEl = driver.findElement(By.xpath("//span[@itemprop='name' and text()='Порядок оплаты и безопасность интернет платежей']"));
        assertTrue(payEl.isDisplayed()); // после перехода по ссылке проверяет есть ли на странице элемент 'Порядок оплаты и безопасность интернет платежей'
    }

    @Test
    @DisplayName("checking the 'continue' button")
    public void testContinueButton(){
        WebElement phoneNumberInput = driver.findElement(By.id("connection-phone"));
        phoneNumberInput.sendKeys("297777777");

        WebElement amountInput = driver.findElement(By.id("connection-sum"));
        amountInput.sendKeys("100");

        WebElement emailInput = driver.findElement(By.id("connection-email"));
        emailInput.sendKeys("mail@mail.ru");

        WebElement continueButton = driver.findElement(By.xpath("//button[contains(@class, 'button__default') and contains(text(), 'Продолжить')]"));
        continueButton.click();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 секунд ожидания
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='bepaid-iframe']"))); // ожидание когда появится iframe
        // ожидание когда элемент станет доступен
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='pay-description__cost']//span[not(contains(@class,'pay-description__cost_converted'))]")));

        WebElement bynElement = driver.findElement(By.xpath("//div[@class='pay-description__cost']//span[not(contains(@class,'pay-description__cost_converted'))]"));
        assertEquals("100.00 BYN", bynElement.getText());
        assertTrue(bynElement.isDisplayed());
    }
}
