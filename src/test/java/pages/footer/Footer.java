package pages.footer;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class Footer extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(Footer.class);
    public static Footer instance;

    private By credit = By.xpath("//div[@class='headline']");
    private By detalii = By.xpath("//span[@class='openForm']");
    private By contactandprogram = By.xpath("//div[@class='col-xs-12 padding-0']");
    private By magazinCJ = By.xpath("//a[@href='/magazin-piese-auto-cluj-napoca']");


    private Footer(){
    }
    public static Footer getInstance(){
        if(instance == null){
            instance = new Footer();
        }
        return instance;
    }
    public boolean checkCredit(){
        LOG.info("Check if Credit image is displayed");
        return driver.findElement(credit).isDisplayed();
    }
    public void clickdetalii(){
        LOG.info("Click Vezi detalii link");
        driver.findElement(detalii).click();
    }
    public boolean checkcontactandprogram(){
        LOG.info("Check if Contact and Program image is displayed");
        return driver.findElement(contactandprogram).isDisplayed();
    }
    public void clickmagazinCJ(){
        LOG.info("Click Magazin Cluj-Napoca link");
        driver.findElement(magazinCJ).click();
    }




}
