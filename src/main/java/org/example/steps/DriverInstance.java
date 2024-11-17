package org.example.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInstance { // Это позволяет гарантировать, что в приложении будет существовать только один экземпляр драйвера
    private WebDriver driver;

    // Создаем экземпляр драйвера только один раз
    public WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

}
