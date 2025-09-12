package methods;

import pages.BcgPage;

public class BcgMethods extends BcgPage {

    protected BcgPage bcgPage = new BcgPage();

    public boolean validateProductName(){
       return driver.findElement(bcgPage.productName).isDisplayed();
    }

    public void setProductSizeS(){
        driver.findElement(bcgPage.productSizeS).click();
    }

    public void setShipping(String shipping){
        driver.findElement(bcgPage.shippingField).sendKeys(shipping);
    }

    public void clickCreditCard(){
        driver.findElement(bcgPage.creditCard).click();
    }

    public void setCardHolderName(String name){
        driver.findElement(bcgPage.creditCardName).sendKeys(name);
    }
    public void setCardNumber(String number){
        driver.findElement(bcgPage.creditCardNumber).sendKeys(number);
    }

    public void setCardExpDate(String date){
        driver.findElement(bcgPage.creditCardExpDate).sendKeys(date);
    }

    public void setCardSecurityCode(String code){
        driver.findElement(bcgPage.creditCardSecurityCode).sendKeys(code);
    }

    public void clickAddCard(){
        driver.findElement(bcgPage.addCardBtn).click();
    }

    public void clickInstallments(){
        driver.findElement(bcgPage.selectInstallments).click();
    }

    public void selectFristInstallments(){
        driver.findElement(bcgPage.selectFirstInstallment).click();
    }

    public void clickPurchaseButton(){
        driver.findElement(bcgPage.puchaseBtn).click();
    }

    public boolean validateCongratulationMessage(){
        String message = driver.findElement(bcgPage.congratulationsText).getText();

        if(message.contains("Congratuations")){
            return true;
        } else {
            return false;
        }
    }


}
