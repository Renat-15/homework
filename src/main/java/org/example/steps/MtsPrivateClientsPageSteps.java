package org.example.steps;

import org.example.pages.MtsPrivateClientsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MtsPrivateClientsPageSteps { // для выполнения действий в тестах

    private final MtsPrivateClientsPage mtsPrivateClientsPage;
    private final WebDriver driver;


    public MtsPrivateClientsPageSteps(WebDriver driver) {
        this.driver = driver;
        this.mtsPrivateClientsPage = new MtsPrivateClientsPage(driver);
    }

    public void scrpllToPaymentSectionTitle(){
        WebElement paymentTitle = mtsPrivateClientsPage.getTitle();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", paymentTitle);
    }
    public boolean isLogoDisplayed(String l){
        return mtsPrivateClientsPage.isLogoDisplayed(l);
    }

    public void clickMoreInfoLink(){
        mtsPrivateClientsPage.getMoreInfoLink().click(); // клик по 'Подробнее о сервисе'
    }
    public boolean isPaymentOrderDisplayed(){
        return mtsPrivateClientsPage.getPaymentOrderElement().isDisplayed();
    }
    public void enterPhoneNumber(String phoneNumber){
        mtsPrivateClientsPage.enterPhoneNumber(phoneNumber);
    }
    public void enterAmount(String amount){
        mtsPrivateClientsPage.enterAmount(amount);
    }
    public void enterEmail(String email){
        mtsPrivateClientsPage.enterEmail(email);
    }
    public void clickContinueButton(){
        mtsPrivateClientsPage.clickContinueButton();
    }
    public WebElement getBynText(){
        return mtsPrivateClientsPage.getBynElement();
    }
    public String getphoneNumberPlaceholder(){
        return mtsPrivateClientsPage.getphoneNumberPlace().getAttribute("placeholder");
    }
    public String getAmountPlaceholder(){
        return mtsPrivateClientsPage.getAmountPlace().getAttribute("placeholder");
    }
    public String getEmailPlaceholder(){
        return mtsPrivateClientsPage.getEmailPlace().getAttribute("placeholder");
    }
    public String getSubscriberNumberPlaceholder(){
        return  mtsPrivateClientsPage.getSubscriberNumberPlace().getAttribute("placeholder");
    }
    public String getAmountPlaceholder2(){
        return mtsPrivateClientsPage.getAmountPlace2().getAttribute("placeholder");
    }
    public String getEmailPlaceholder2(){
        return mtsPrivateClientsPage.getEmailPlace2().getAttribute("placeholder");
    }
    public String getAccountNumberPlaceholder(){
        return mtsPrivateClientsPage.getAccountNumberPlace().getAttribute("placeholder");
    }
    public String getAmountPlaceholder3(){
        return mtsPrivateClientsPage.getAmountPlace3().getAttribute("placeholder");
    }
    public String getEmailPlaceholder3(){
        return mtsPrivateClientsPage.getEmailPlace3().getAttribute("placeholder");
    }
    public String getAccountNumberPlaceholder1(){
        return mtsPrivateClientsPage.getAccountNumberPlace1().getAttribute("placeholder");
    }
    public String getAmountPlaceholder4(){
        return mtsPrivateClientsPage.getAmountPlace4().getAttribute("placeholder");
    }
    public String getEmailPlaceholder1(){
        return mtsPrivateClientsPage.getEmailPlace1().getAttribute("placeholder");
    }
    public String getPhoneNumberPlace(){
        return mtsPrivateClientsPage.getPhoneNumber().getText();
    }
    public String getCardNumberSt(){
        return mtsPrivateClientsPage.getCardNumber().getText();
    }
    public String getValidityPeriodPlace(){
        return mtsPrivateClientsPage.getValidityPeriod().getText();
    }
    public String getCVCPlace(){
        return mtsPrivateClientsPage.getCVC().getText();
    }
    public String getNameOfTheHolderPlace(){
        return mtsPrivateClientsPage.getNameOfTheHolder().getText();
    }
    public boolean isVisibleLogoVisa(){
        return mtsPrivateClientsPage.getLogoVisa().isDisplayed();
    }
    public boolean isVidibleLogoMastercard(){
        return mtsPrivateClientsPage.getLogoMastercard().isDisplayed();
    }
    public boolean isVidiblelogoBelkart(){
        return mtsPrivateClientsPage.getlogoBelkart().isDisplayed();
    }
    public boolean isVidibleLogoMirCard(){
        return mtsPrivateClientsPage.getLogoMirCard().isDisplayed();
    }
    public void enterCardNumber1(String CardNumber){
        mtsPrivateClientsPage.enterCardNumber(CardNumber);
    }
    public void enterValidityPeriod1(String validityPeriod){
        mtsPrivateClientsPage.enterValidityPeriod(validityPeriod);
    }
    public void enterCVC1(String cvc){
        mtsPrivateClientsPage.enterCVC(cvc);
    }
    public void enterNameOfTheHolder1(String nameOfTheHolder){
        mtsPrivateClientsPage.enterNameOfTheHolder(nameOfTheHolder);
    }
    public WebElement getpayButton1(){
        return mtsPrivateClientsPage.getPayButton();
    }
}
