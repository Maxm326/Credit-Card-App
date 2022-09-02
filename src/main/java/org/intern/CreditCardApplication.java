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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

}
