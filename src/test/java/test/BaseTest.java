package test;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.homepage.HomePage;
import pages.homepage.addtocart.AddToCart;


public class BaseTest {
    public HomePage homePage = HomePage.getInstance();
    public AddToCart addtocart = AddToCart.getInstance();


    @BeforeSuite
    public void init(){ BasePage.SetUP();}

    @AfterSuite
    public void tearDown(){BasePage.tearDown();}

}
