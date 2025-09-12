package tests;


import org.testng.annotations.Test;
import part1.SetupClass;

public class PurchaseHappyPath extends SetupClass {
    @Test
    public void happyPath() throws InterruptedException {

        bcgMethods.validateProductName();

        bcgMethods.setProductSizeS();

        bcgMethods.setShipping("1111111");

        bcgMethods.clickCreditCard();

        Thread.sleep(1500);

        bcgMethods.setCardHolderName("Diego");
        bcgMethods.setCardNumber("1234567890");
        bcgMethods.setCardExpDate("08/30");
        bcgMethods.setCardSecurityCode("929");
        bcgMethods.clickAddCard();

        bcgMethods.clickInstallments();
        Thread.sleep(1500);

        bcgMethods.selectFristInstallments();
        bcgMethods.clickPurchaseButton();

        bcgMethods.validateCongratulationMessage();

    }
}
