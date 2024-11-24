package org.example.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MtsPrivateClientsPage extends BasePage{ // содержить методы для взаимодействия с элементами на странице

    private final By servicesDropdown = By.xpath("//button[contains(@class, 'select__header')]"); // Локатор для кнопки выпадающего списка

    public MtsPrivateClientsPage(WebDriver driver) {
        super(driver);
    }

    private final By accountNumberLocator1 = By.xpath("//input[@id='score-arrears']");
    private final By amountPlace4Locator = By.xpath("//input[@id='arrears-sum']");
    private final By emailPlaceLocator4 = By.xpath("//input[@id='arrears-email']");

    public WebElement getAccountNumberPlace1(){
        return driver.findElement(accountNumberLocator1);
    }

    public WebElement getAmountPlace4(){
        return driver.findElement(amountPlace4Locator);
    }

    public WebElement getEmailPlace1(){
        return driver.findElement(emailPlaceLocator4);
    }
}
