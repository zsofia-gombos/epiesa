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
    private By marciauto = By.xpath("/html/body/div[3]/div/ul/li[1]/a");
    private By garantiesiretur = By.xpath("//a[@title='garantie si retur']");
    private By termenisiconditii = By.xpath("//a[@href='/termeni-si-conditii/']");
    private By livrare = By.xpath("//a[@title='livrarea produselor']");
    private By contact = By.xpath("//a[@title='contact epiesa.ro']");
    private By confidentialitate = By.xpath("//a[@href='/politica-confidentialitate-epiesa/']");
    private By ANPC = By.xpath("//a[@href='http://www.anpc.gov.ro/']");


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
    public void clickmarciauto(){
        LOG.info("Click marci auto link");
        driver.findElement(marciauto).click();
    }
    public void clickgarantiesiretur(){
        LOG.info("Click garantie si retur link");
        driver.findElement(garantiesiretur).click();
    }
    public void clicktermenisiconditii(){
        LOG.info("Click termeni si conditii link");
        driver.findElement(termenisiconditii).click();
    }
    public void clicklivrare(){
        LOG.info("Click despre livrare link");
        driver.findElement(livrare).click();
    }
    public void clickcontact(){
        LOG.info("Click contact link");
        driver.findElement(contact).click();
    }
    public void clickconfidentialitate(){
        LOG.info("Click confidentalitatea datelor link");
        driver.findElement(confidentialitate).click();
    }
    public void clickANPC(){
        LOG.info("Click ANPC link");
        driver.findElement(ANPC).click();
    }




}
