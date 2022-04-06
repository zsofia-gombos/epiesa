package test.footerTest;

import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class FooterTest extends BaseTest {
    private String newUrl = getBaseUrl() +"Footer.html";

    @Test
    public void testFooter(){
        driver.get(newUrl);
    }
}
