package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //add web driver manager
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://amazon.com");
        WebElement searchBoxElement = driver.findElement( By.name("field-keywords") );
        searchBoxElement.sendKeys("iphone" );

        WebElement searchButtonElement = driver.findElement(By.id("nav-search-submit-button"));
        searchButtonElement.click();




    }
}