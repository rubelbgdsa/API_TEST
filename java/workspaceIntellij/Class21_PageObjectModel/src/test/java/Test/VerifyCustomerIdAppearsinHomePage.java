package Test;


import Base.Base;
import org.openqa.selenium.By;
import Page.CustomerLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class VerifyCustomerIdAppearsinHomePage extends Base {
        @Test
        public void VerifyCustomerIdAppearsinHomePage () {

           // Base.startUp();

            //Navigate to URL
            navigate("http://it.microtechlimited.com");

            //Login as Customer
            CustomerLoginPage.loginAsCustomer();


            //-------------------- Customer Home page
            //Verify Test's Home Page
            String customerMsg = getText( By.xpath("//h2[contains(text(),'Customer')]") );

            Assert.assertEquals(customerMsg,"Customer Id: 4");


        }
}
