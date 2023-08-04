package test;

import base.Base;
import org.openqa.selenium.By;

public class Verify_EmployeeLoginFunctionality extends Base {
    public static void main(String[] args) {
        Base.startUp();

        navigate("https://it.microtechlimited.com");

        click("//a[@href='elogin.php']");

        click("//a[@href='elogin.php']");

        sendKeys("//input[@name='mailuid']","testpilot@gmail.com");

        sendKeys("//input[@name='pwd']","1234");

        click("//input[@name='login-submit']");

        String welcomeMsg = getText("//h2[contains(text(),'Welcome')]");
        if (welcomeMsg.contains("Test"))
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
