package Base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
        public static WebDriver driver;
        @BeforeTest
        public static void startUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        @AfterTest
        public static void close() throws InterruptedException {
            Thread.sleep(20000);
            driver.close();//Tab close
            driver.quit();// Close The whole Browser
        }

        public static void navigate(String url) {
            driver.get(url);
        }

        public static void click( By locator  ) {
            driver.findElement( locator ).click();
        }

        public static void sendKeys(By locator, String keys) {
            driver.findElement( locator ).sendKeys(keys);
        }

        public static String getText(By locator) {
            String s = driver.findElement(locator).getText();
            return s;
        }

    }
