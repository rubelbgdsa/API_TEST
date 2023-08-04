package Test;

import Base.Base;
import Page.CustomerHomePage;
import Page.CustomerLoginPage;
import Page.EmployeeLoginPage;
import Page.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyCustomerLoginFunctionality extends Base {
        @Test
        public void VerifyCustomerLoginFunctionality() {



            //Navigate to URL
            navigate("http://it.microtechlimited.com");

            //-------------------- landing page
            //Click Login Menu
            click( LandingPage.menuLogin );

            //-------------------- employee Login page
            //Click Customer Login Menu
            click(EmployeeLoginPage.menuCustomerLogin );

            //-------------------- customer Login page
            //Enter Customer User Id
            sendKeys( CustomerLoginPage.textCustomerUserId , "david@gmail.com");

            //Enter Customer Password
            sendKeys( CustomerLoginPage.textCustomerPassword ,"1234");

            //Click Customer Login Button
            click( CustomerLoginPage.btnCustomerLogin );

            //-------------------- Customer Home page
            //Verify Test's Home Page
            String welcomeMsg = getText( CustomerHomePage.labelWelcomeMsg );

            Assert.assertEquals(welcomeMsg,"David");

        }
}
