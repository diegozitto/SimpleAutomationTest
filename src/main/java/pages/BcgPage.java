package pages;

import config.TestSetup;
import org.openqa.selenium.By;

public class BcgPage extends TestSetup {

    public By productName = By.xpath("//p[text()='BASIC T-SHIRT']");
//    public By subtractItem = By.xpath("//button[@id='subtract-button']");
//    public By addItem = By.xpath("//button[@id='add-button']");
    public By shippingField = By.xpath("//input[@id='zip-code-input']");
    public By creditCard = By.xpath("//p[text()='Credit card']");
    public By creditCardName = By.xpath("//input[@id='card-name-input']");
    public By creditCardNumber = By.xpath("//input[@id='card-number-input']");
    public By creditCardExpDate = By.xpath("//input[@id='card-expiration-input']");
    public By creditCardSecurityCode = By.xpath("//input[@id='card-security-code-input']");
    public By addCardBtn = By.xpath("//button[@id='add-card-button']");
    public By selectInstallments = By.xpath("//button[text()='Select Installments']");
    public By puchaseBtn = By.xpath("//button[@id='purchase-button']");
    public By congratulationsText = By.xpath("//p[text()='Congratuations']");

}
