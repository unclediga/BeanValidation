package ru.unclediga.cascade;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class CreditCardConst extends CreditCard {
    String cardNumber;
    Date expirationDate;
    String testCode;

    @NotNull
    public CreditCardConst(@NotNull String cardNumber, @NotNull @Future Date expirationDate, @NotNull @Size(min = 5) String testCode) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.testCode = testCode;
    }

    @Override
    public CreditCard getCopy() {
        return new CreditCardConst(cardNumber, expirationDate, testCode);
    }

    public CreditCardConst() {

    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getTestCode() {
        return testCode;
    }

    @Override
    public void setTestCode(String testCode) {
        this.testCode = testCode;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", expirationDate=" + expirationDate +
                ", testCode='" + testCode + '\'' +
                '}';
    }
}
