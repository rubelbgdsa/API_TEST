package test;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Verify_PageHeading extends Base {
    public static void main(String[] args) {
        Base.startUp();
        getTextCheck("//div/h1","Welcome to MicroTech NA.");
    }
}
