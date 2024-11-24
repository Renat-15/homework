package org.example.steps;

import io.qameta.allure.Step;
import org.example.pages.MtsPrivateClientsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MtsPrivateClientsPageSteps { // для выполнения действий в тестах

    private final MtsPrivateClientsPage mtsPrivateClientsPage;
    private final WebDriver driver;
    // Локатор для кнопки выпадающего списка
    private final By servicesDropdown = By.xpath("//button[contains(@class, 'select__header')]");
    //Локатор для выбора услуги "Задолженность"
    private final By debtOption = By.xpath(" //li[@class='select__item']/p[contains(text(), 'Задолженность')]");

    public MtsPrivateClientsPageSteps(WebDriver driver) {
        this.driver = driver;
        this.mtsPrivateClientsPage = new MtsPrivateClientsPage(driver);
    }
    @Step("Нажали на кнопку выпадающего списка")
    public WebElement openServicesDropdown(){
        return driver.findElement(servicesDropdown);
    }
    @Step("Нажали на кнопку выбора услуги 'Задолженности'")
    public WebElement selectDebt(){
        return driver.findElement(debtOption);
    }

    @Step("Проверили плейсхолдер в поле 'Номер счета на 2073'")
    public void verifiedPhonePlaceholder(String expectedNumber){
        String actualPhonePlaceholder = mtsPrivateClientsPage.getAccountNumberPlace1().getAttribute("placeholder");
        assertEquals(expectedNumber, actualPhonePlaceholder);
    }
    @Step("Проверили плейсхолдер в поле 'Сумма'")
    public void verifiedAmountPlaceholder(String expectedAmount){
        String actualAmountPlaceholder = mtsPrivateClientsPage.getAmountPlace4().getAttribute("placeholder");
        assertEquals(expectedAmount, actualAmountPlaceholder);
    }
    @Step("Проверили плейсхолдер в поле 'E-mail для отправки чека'")
    public void verifiedEmailPlaceholder(String expectedEmail){
        String actualEmail = mtsPrivateClientsPage.getEmailPlace1().getAttribute("placeholder");
        assertEquals(expectedEmail, actualEmail);
    }
}

