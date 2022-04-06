package pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HomePage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    public static HomePage instance;

    private By logo = By.xpath("//img[@src='/images/logo.png']");

    private By commercial = By.xpath("//img[@class='hidden-xs on_desk']");
    private By commercial2 = By.xpath("//img[@alt='piese auto in 6 rate fara dobanda']");

    private By selectMarca = By.xpath("//select[@name='select_marca']");
    private By enterMarca = By.xpath("//select[@name='select_marca']");

    private By enterModel = By.id("model_marca");
    private By selectModel = By.id("model_marca");

    private By selectCarburant = By.id("carburant");
    private By enterCarburant = By.id("carburant");

    private By selectCilindree = By.id("cilindree");
    private By enterCilindree = By.id("cilindree");

    private By selectPutere = By.id("motorizari");
    private By enterPutere = By.id("motorizari");

    private By filtruuleiLink = By.xpath("//a[@title='Suport ansamblu amortizor arc AUDI 80 (613) 1.7 benzina 80 cai']");


    private HomePage() {
    }

    public static HomePage getInstance() {
        if (instance == null) {
            instance = new HomePage();
        }
        return instance;
    }

    public boolean checkLogo() {
        LOG.info("Check if Logo is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public boolean checkCommercial() {
        LOG.info("Check if Saptamana Preturilor Mici commercial is displayed ");
        return driver.findElement(commercial).isDisplayed();
    }

    public boolean checkCommercial2() {
        LOG.info("Check if 6 Rate commercial is displayed");
        return driver.findElement(commercial2).isDisplayed();
    }

    public void setMarca(String marca) {
        LOG.info("Set Marca");
        driver.findElement(selectMarca).click();
        driver.findElement(enterMarca).sendKeys(marca);
    }

    public void setModel(String model) {
        LOG.info("Set Model");
        driver.findElement(selectModel).click();
        driver.findElement(enterModel).sendKeys(model);
    }

    public void setCarburant(String carburant) {
        LOG.info("Set Carburant");
        driver.findElement(selectCarburant).click();
        driver.findElement(enterCarburant).sendKeys(carburant);
    }

    public void setCilindree(String cilindree) {
        LOG.info("Set Cilindree");
        driver.findElement(selectCilindree).click();
        driver.findElement(enterCilindree).sendKeys(cilindree);
    }
    public void setPutere(String putere){
        LOG.info("Set Putere");
        driver.findElement(selectPutere).click();
        driver.findElement(enterPutere).sendKeys(putere);
    }
    public void scrollToElement(){
        WebElement element = driver.findElement(filtruuleiLink);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }
}
