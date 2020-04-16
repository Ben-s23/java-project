package project;
import java.util.*;

// A super class, RentalProperty, for the two different rental property.
public class Person extends Tenant{
    int rentalID;
    String name;

    public Person(int tenantID, int rentalID, String name) {
        super(tenantID);
        this.rentalID = rentalID;
        this.name = name;
    };
}
