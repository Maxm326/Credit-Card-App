package org.intern;

import java.math.BigDecimal;

public class CreditCardApplication {
    //setting attributes
    String firstName;
    String lastName;
    Integer age;
    Integer creditScore;
    boolean appAccepted;

    //constructor method
    public CreditCardApplication(String firstName, String lastName, Integer age, Integer creditScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.creditScore = creditScore;
    }

    //method to make approval decision
    public boolean getAccepted() {
        if (age <= 18) {
            return false;
        } else if (creditScore < 780) {
            return false;
        } else {
            return true;
        }
    }

    {

    }
}
