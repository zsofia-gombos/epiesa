package test.footerTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.footer.Footer;
import test.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class FooterTest extends BaseTest {
    private String newUrl = getBaseUrl()+ "Footer.html";

    @Test
    public void testFooter(){
        driver.get(newUrl);
        Assert.assertTrue(footer.checkCredit(), "Image is displayed");
        footer.clickdetalii();
        driver.navigate().back();
        Assert.assertTrue(footer.checkcontactandprogram(),"Image is displayed");
        driver.navigate().back();
        footer.clickmagazinCJ();
        driver.navigate().back();



    }
}
