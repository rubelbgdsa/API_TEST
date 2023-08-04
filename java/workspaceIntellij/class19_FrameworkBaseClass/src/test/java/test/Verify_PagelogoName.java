package test;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Verify_PagelogoName extends Base {
    public static void main(String[] args) {
        Base.startUp();
        getTextCheck("//nav/h1","MicroTech NA");
    }
}
