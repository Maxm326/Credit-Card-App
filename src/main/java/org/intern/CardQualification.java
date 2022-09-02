package org.intern;

public class CardQualification {
    public static boolean isAccepted(CreditCardApplication c) {
        if (c.getAge() <= 18){
            return false;
        } else if (c.getCreditScore() < 780) {
            return false;
        } else {
            return true;
        }
    }
}

