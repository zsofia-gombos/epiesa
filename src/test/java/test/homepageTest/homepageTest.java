package test.homepageTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

public class homepageTest extends BaseTest {
    @Test
    public void testLogoIsDisplayed(){

        Assert.assertTrue(homePage.checkLogo(), "Logo is not displayed");
        Assert.assertTrue(homePage.checkCommercial(), "Commercial is displayed");
        Assert.assertTrue(homePage.checkCommercial2(), "Commercial2 is displayed");
        homePage.setMarca("Audi");
        homePage.setModel("80 (1966 - 1968)");
        homePage.setCarburant("Benzina");
        homePage.setCilindree("1.7");
        homePage.setPutere("80 cai");
    }
}
