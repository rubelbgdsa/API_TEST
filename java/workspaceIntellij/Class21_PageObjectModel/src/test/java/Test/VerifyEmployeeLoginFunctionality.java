package Test;


import Base.Base;
import Page.EmployeeHomePage;
import Page.EmployeeLoginPage;
import Page.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class VerifyEmployeeLoginFunctionality extends Base{
        @Test
        public void VerifyEmployeeLoginFunctionality() {

          //  Base.startUp();

            //Navigate to URL
            navigate("http://it.microtechlimited.com");

            //-------------------- landing page
            //Click Login Menu
            click( LandingPage.menuLogin );

            //-------------------- Employee Login page
            //Click Employee Login Menu
            click( EmployeeLoginPage.menuEmployeeLogin );

            //Enter Employee User Id
            sendKeys( EmployeeLoginPage.textEmployeeUserId , "testpilot@gmail.com");

            //Enter Employee Password
            sendKeys( EmployeeLoginPage.textEmployeePassword ,"1234");

            //Click Employee Login Button
            click( EmployeeLoginPage.btnEmployeeLogin );

            //-------------------- Employee Home page
            //Verify Test's Home Page

            String welcomeMsg = getText( EmployeeHomePage.labelWelcomeMsg );

            Assert.assertEquals(welcomeMsg,"Welcome Test");

        }
}
