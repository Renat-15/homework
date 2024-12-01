package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MtsPrivateClientsPage extends BasePage{ // содержить методы для взаимодействия с элементами на странице

    private final By blockPaymentSectionTitleLocator  = By.xpath("//section[@class='pay']//h2[contains(text(), 'Онлайн пополнение') and " +
            "contains(., 'без комиссии')]");
    private final By servicesDropdown = By.xpath("//button[contains(@class, 'select__header')]"); // Локатор для кнопки выпадающего списка

    public MtsPrivateClientsPage(WebDriver driver) {
        super(driver);
    }
    // Метод для получения заголовка блока
    public WebElement getTitle(){
        return driver.findElement(blockPaymentSectionTitleLocator);
    }
    private final By LogosContainerLocator =  By.xpath("//div[@class='pay__partners']//ul"); // Локаторы логотипов
    //Метод для получения списка логотипов
    public WebElement getLogosContainer(){
        return driver.findElement(LogosContainerLocator);
    }
    //Метод для проверки наличия логотипа
    public boolean isLogoDisplayed(String l){
        WebElement logo = getLogosContainer().findElement(By.xpath(".//img[@alt='" + l + "']"));
        return logo.isDisplayed();
    }
    private final By moreInfoLinkLocator = By.xpath("//section[@class='pay']//a[contains(text(), 'Подробнее о сервисе')]");
    // Метод для получения ссылки "Подробнее о сервисе"
    public WebElement getMoreInfoLink(){
        return driver.findElement(moreInfoLinkLocator);
    }
    // Метод для поиска ссылки "Порядок оплаты и безопасность интернет платежей"
    private final By payEl = By.xpath("//span[@itemprop='name' and text()='Порядок оплаты и безопасность интернет платежей']");
    public WebElement getPaymentOrderElement(){
        return driver.findElement(payEl);
    }
    private final By phoneNumberInputLocator = By.id("connection-phone");
    // Метод для ввода номера телефона
    public void enterPhoneNumber(String phoneNumber){
        WebElement phoneNumberInput = driver.findElement(phoneNumberInputLocator);
        phoneNumberInput.sendKeys(phoneNumber);
    }
    private final By amountInputLocator = By.id("connection-sum");
    // Метод для ввода суммы
    public void enterAmount(String amount){
        WebElement amountInput = driver.findElement(amountInputLocator);
        amountInput.sendKeys(amount);
    }
    private final By emailInputLocator = By.id("connection-email");
    // Метод для ввода email
    public void enterEmail(String email){
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys(email);
    }
    private final By continueButtonLocator = By.xpath("//button[contains(@class, 'button__default') and contains(text(), 'Продолжить')]");
    // Метод для нажатия кнопки "Продолжить"
    public void clickContinueButton(){
        WebElement continueButton = driver.findElement(continueButtonLocator);
        continueButton.click();
    }
    private final By bynElementLocator = By.xpath("//div[@class='pay-description__cost']//span[not(contains(@class,'pay-description__cost_converted'))]");
    // Метод для получения элемента с суммой
    public WebElement getBynElement(){
        return driver.findElement(bynElementLocator);
    }

    private final By phoneNumberPlaceLocator = By.xpath("//input[@id='connection-phone']");
    public WebElement getphoneNumberPlace(){
        return driver.findElement(phoneNumberPlaceLocator);
    }
    private final By amountPlaceLocator = By.xpath("//input[@id='connection-sum']");
    public WebElement getAmountPlace(){
        return driver.findElement(amountPlaceLocator);
    }
    private final By emailPlace = By.xpath("//input[@id='connection-email']");
    public WebElement getEmailPlace(){
        return driver.findElement(emailPlace);
    }
    // Метод для открытия выпадающего списка
    public void openServicesDropdown(){
        driver.findElement(servicesDropdown).click();
    }
    private final By internerOptionLocator = By.xpath("//li[contains(@class, 'select__item')]/p[text()='Домашний интернет']");
    private final By SubNumLocator = By.xpath("//input[@id='internet-phone']");
    private final By amountPlace2Locator = By.xpath("//input[@id='internet-sum']");
    private final By emailPlaceLocator2 = By.xpath("//input[@id='internet-email']");
    public void selectInternet(){
        openServicesDropdown();
        driver.findElement(internerOptionLocator).click();
    }
    public WebElement getSubscriberNumberPlace(){
        return driver.findElement(SubNumLocator);
    }

    public WebElement getAmountPlace2(){
        return driver.findElement(amountPlace2Locator);
    }

    public WebElement getEmailPlace2(){
        return driver.findElement(emailPlaceLocator2);
    }
    public void openServicesDropdown1(){
        driver.findElement(servicesDropdown).click();
    }
    private final By installmentOption = By.xpath("//li[@class='select__item']/p[contains(text(), 'Рассрочка')]");
    private final By accountNumberLocator = By.xpath("//input[@id='score-instalment']");
    private final By amountPlace3Locator = By.xpath("//input[@id='instalment-sum']");
    private final By emailPlaceLocator3 = By.xpath("//input[@id='instalment-email']");

    public void selectInstallment(){
        openServicesDropdown1();
        driver.findElement(internerOptionLocator).click();
    }
    public WebElement getAccountNumberPlace(){
        return driver.findElement(accountNumberLocator);
    }
    public WebElement getAmountPlace3(){
        return driver.findElement(amountPlace3Locator);
    }
    public WebElement getEmailPlace3(){
        return driver.findElement(emailPlaceLocator3);
    }

    public void openServicesDropdown2(){
        driver.findElement(servicesDropdown).click();
    }
    private final By debtOption = By.xpath(" //li[@class='select__item']/p[contains(text(), 'Задолженность')]");
    private final By accountNumberLocator1 = By.xpath("//input[@id='score-arrears']");
    private final By amountPlace4Locator = By.xpath("//input[@id='arrears-sum']");
    private final By emailPlaceLocator4 = By.xpath("//input[@id='arrears-email']");

    public void selectDebt(){
        openServicesDropdown2();
        driver.findElement(debtOption).click();
    }

    public WebElement getAccountNumberPlace1(){
        return driver.findElement(accountNumberLocator1);
    }

    public WebElement getAmountPlace4(){
        return driver.findElement(amountPlace4Locator);
    }

    public WebElement getEmailPlace1(){
        return driver.findElement(emailPlaceLocator4);
    }
    public void openServicesDropdown3(){
        driver.findElement(servicesDropdown).click();
    }

    private final By servicesOption = By.xpath("//li[@class='select__item active']/p[@class='select__option' and text()='Услуги связи']");
    private final By phoneNumberLocator = By.xpath("//div[@class='pay-description__text']/span[contains(text(), 'Оплата: Услуги связи') and contains(text(), 'Номер:375297777777')]");
    private final By cardNumberLocator = By.xpath("//div[@class='content ng-tns-c46-1']/label[text()='Номер карты']");
    private final By validityPeriod = By.xpath("//div[@class='content ng-tns-c46-4']/label[text()='Срок действия']");
    private final By CVCLocator = By.xpath("//div[@class='content ng-tns-c46-5']//label[text()='CVC']");
    private final By nameOfTheHolderLocator = By.xpath("//div[@class='content ng-tns-c46-3']//label[text()='Имя держателя (как на карте)']");
    private final By logoVisaLocator = By.xpath("//div[contains(@class, 'cards-brands')]/img[contains(@src, 'assets/images/payment-icons/card-types/visa-system.svg')]");
    private final By logoMastercardLocator = By.xpath("//div[contains(@class, 'cards-brands')]/img[contains(@src, 'assets/images/payment-icons/card-types/mastercard-system.svg')]");
    private final By logoBelkartLocator = By.xpath("//div[contains(@class, 'cards-brands')]/img[contains(@src, 'assets/images/payment-icons/card-types/belkart-system.svg')]");
    private final By logoMirCardLocator = By.xpath("//div[contains(@class, 'cards-brands') and contains(@class, 'cards-brands_random')]");
    private final By cardNumberLocator1 = By.xpath("//input[@id='cc-number']");
    private final By validityPeriodLocator = By.xpath("//div[@class='content ng-tns-c46-4']//input[@formcontrolname='expirationDate']");
    private final By CVCLocator1 = By.xpath("//div[@class='content ng-tns-c46-5']//input[@formcontrolname='cvc']");
    private final By nameOfTheHolderLocator1 = By.xpath("//div[@class='content ng-tns-c46-3']//input[@formcontrolname='holder']");
    private final By payButtonLocator = By.xpath("//button[@class='colored' and text()=' Оплатить  100.00 BYN ']");


    public void selectServices(){
        openServicesDropdown2();
        driver.findElement(servicesOption).click();
    }

    // Метод для получения элемента с суммой
    public WebElement getBynElement1(){
        return driver.findElement(bynElementLocator);
    }

    // Метод для получения элемента
    public WebElement getPhoneNumber(){
        return driver.findElement(phoneNumberLocator);
    }
    public WebElement getCardNumber(){
        return driver.findElement(cardNumberLocator);
    }
    public WebElement getValidityPeriod(){
        return driver.findElement(validityPeriod);
    }
    public WebElement getCVC(){
        return driver.findElement(CVCLocator);
    }
    public WebElement getNameOfTheHolder(){
        return driver.findElement(nameOfTheHolderLocator);
    }
    public WebElement getLogoVisa(){
        return driver.findElement(logoVisaLocator);
    }
    public WebElement getLogoMastercard(){
        return driver.findElement(logoMastercardLocator);
    }
    public WebElement getlogoBelkart(){
        return driver.findElement(logoBelkartLocator);
    }
    public WebElement getLogoMirCard(){
        return driver.findElement(logoMirCardLocator);
    }
    public void enterCardNumber(String CardNumber){
        WebElement cardNumberInput = driver.findElement(cardNumberLocator1);
        cardNumberInput.sendKeys(CardNumber);
    }
    public void enterValidityPeriod(String validityPeriod){
        WebElement validityPeriodInput = driver.findElement(validityPeriodLocator);
        validityPeriodInput.sendKeys(validityPeriod);
    }
    public void enterCVC(String cvc){
        WebElement CVCInput = driver.findElement(CVCLocator1);
        CVCInput.sendKeys(cvc);
    }
    public void enterNameOfTheHolder(String nameOfTheHolder){
        WebElement nameOfTheHolderInput = driver.findElement(nameOfTheHolderLocator1);
        nameOfTheHolderInput.sendKeys(nameOfTheHolder);
    }
    public WebElement getPayButton(){
        return driver.findElement(payButtonLocator);
    }
}
