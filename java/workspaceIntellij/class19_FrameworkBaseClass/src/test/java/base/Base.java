package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public static WebDriver driver;

    public static void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public static void navigate(String url){
        driver.get(url);
    }
    public static void getTextCheck(String xpath, String text){
     WebElement LogoTextElement = Base.driver.findElement(By.xpath(xpath));
     String logoText = LogoTextElement.getText();
     if (LogoTextElement.equals(text))
         System.out.println("Pass");
     else
         System.out.println("Fail");
     }
     public static void click (String xpath){
        driver.findElement(By.xpath(xpath)).click();
     }
     public static void sendKeys(String xpath, String keys) {
     driver.findElement(By.xpath(xpath)).sendKeys(keys);
     }
    public static String getText(String xpath) {
        String s = driver.findElement(By.xpath(xpath)).getText();
        return s;
    }

}
