package org.intern;

public class main
{
    public static void main( String[] args )
    {
        //create instances for all three applicants
        CreditCardApplication c1 = new CreditCardApplication("Bob", "Kins", 30, 650);
        CreditCardApplication c2 = new CreditCardApplication("Bobina", "Morris", 18, 788);
        CreditCardApplication c3 = new CreditCardApplication("Mark", "Park", 31, 790);

        //checks the applicants against the approval criteria
        System.out.println(c1.getFirstName() + " " + c1.getLastName()+ " was accepted: " + CardQualification.isAccepted(c1));
        System.out.println(c2.getFirstName() + " " + c2.getLastName() + " was accepted: " + CardQualification.isAccepted(c2));
        System.out.println(c3.getFirstName() + " " + c3.getLastName()+ " was accepted: " + CardQualification.isAccepted(c3));

    }
}

