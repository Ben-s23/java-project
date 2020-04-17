package project;
import java.util.*;

// A super class, RentalProperty, for the two different rental property.
public class Person extends Tenant{
    int propertyID;

    public Person(int tenantID, int propertyID, String name, String email, String phone) {
        super(tenantID, name, email, phone);
        this.propertyID = propertyID;
    };

    public int getPropertyID(){
        return this.propertyID;
    }
}
