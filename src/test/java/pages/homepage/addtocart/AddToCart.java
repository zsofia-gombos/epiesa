package pages.homepage.addtocart;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class AddToCart extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(AddToCart.class);
    private static AddToCart instance;

    private By marcaAuto = By.xpath("//img[@src='/images/icon-marci/piese-auto/icon13.png']");
    private By pieseAuto = By.xpath("//a[@href='/piese-auto-daf:45']");
    private By pieseDAF = By.xpath("//a[@href='/piese-auto-daf:45:714']");
    private By pieseFA = By.xpath("//a[@href='/piese-auto-daf:45:714:FA 45.120-06']");
    private By pieseDAFdiesel = By.xpath("//a[@href='/piese-auto-daf-45-fa-45-120-06-diesel-116-cai/504435/categorii/']");
    private By pieseRotula = By.xpath("//a[@href='/rotula-daf-45-fa-45-120-06-diesel-116-cai/504435/subcat-200513/']");
    private By pieseCAPDEBARA = By.xpath("//a[@href='/cap-de-bara-daf-45-fa-45-120-06-diesel-116-cai-trucktec-automotive-02-31-277/504435/200513/epsitem-2003805/']");
    private By adaugaINCOSbutton = By.xpath("//button[@class='btn_red product_button new--cart']");
    private By cosulmeubutton = By.xpath("//a/span[@class='text']");



    private AddToCart(){
    }
    public static AddToCart getInstance(){
        if (instance ==null){
            instance = new AddToCart();
        }
        return instance;
    }
    public void clickmarcaAuto(){
        LOG.info("Click marca auto image");
        driver.findElement(marcaAuto).click();
    }
    public void clickpieseAuto(){
        LOG.info("Click piese auto image");
        driver.findElement(pieseAuto).click();
    }
    public void clickpieseDAF(){
        LOG.info("Click piese DAF");
        driver.findElement(pieseDAF).click();
    }
    public void clickpieseFA(){
        LOG.info("Click piese FA");
        driver.findElement(pieseFA).click();
    }
    public void clickpieseDAFdiesel(){
        LOG.info("Click piese DAF diesel");
        driver.findElement(pieseDAFdiesel).click();
    }
    public void clickpieseRotula(){
        LOG.info("Click piese Rotula");
        driver.findElement(pieseRotula).click();
    }
    public void clickpieseCAPDEBARA(){
        LOG.info("Click piese cap de bara");
        driver.findElement(pieseCAPDEBARA).click();
    }
    public void clickadaugaINCOSbutton(){
        LOG.info("Click Adauga in Cos button");
        driver.findElement(adaugaINCOSbutton).click();
    }
    public void clickcosulmeubutton(){
        LOG.info("Click Cosul meu button");
        driver.findElement(cosulmeubutton).click();
    }

}









