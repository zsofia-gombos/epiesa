package test.homepageTest.addtocarttest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.homepage.addtocart.AddToCart;
import test.BaseTest;
import static pages.BasePage.getBaseUrl;
import static pages.BasePage.driver;

public class AddToCartTest extends BaseTest {
    private String newUrl = getBaseUrl()+ "AddToCart.html";

    @Test
    public void testAddToCart(){
        driver.get(newUrl);
        addtocart.clickmarcaAuto();
        addtocart.clickpieseAuto();
        addtocart.clickpieseDAF();
        addtocart.clickpieseFA();
        addtocart.clickpieseDAFdiesel();
        addtocart.clickpieseRotula();
        addtocart.clickpieseCAPDEBARA();
        addtocart.clickadaugaINCOSbutton();
        addtocart.clickcosulmeubutton();
    }


}
