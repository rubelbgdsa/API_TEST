package test;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifySlogan extends Base {
    public static void main(String[] args) {
        Base.startUp();
        getTextCheck("//p","Your One Stop Soloution");
    }
}
