package tests;


import org.testng.annotations.Test;
import part1.SetupClass;

public class PurchaseHappyPath extends SetupClass {
    @Test
    public void happyPath() throws InterruptedException {

        bcgMethods.validateProductName();

        bcgMethods.setProductSize("M");

        bcgMethods.setShipping("1111111");

        bcgMethods.clickCreditCard();

        Thread.sleep(1000);

        bcgMethods.setCardHolderName("Diego");
        bcgMethods.setCardNumber("1234567890");
        bcgMethods.setCardExpDate("08/30");
        bcgMethods.setCardSecurityCode("929");
        bcgMethods.clickAddCard();

        bcgMethods.clickInstallments();
        bcgMethods.selectInstallments("2");

        bcgMethods.clickPurchaseButton();

        bcgMethods.validateCongratulationMessage();

    }
}
