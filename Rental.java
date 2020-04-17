package project;
import java.util.*;

// A super class, RentalProperty, for the two different rental property.
public class Rental{
    //protected so that the subclasses can access later
    protected int propertyID;  //property ID
    protected float rentAmt;  //rent amount
    protected int lease; //number of days (365 year lease, 90 for 3 month, etc)
    protected String location; //property location
    protected int beds; //number of bedrooms
    protected int renterID;  //who is renting it, if null - unoccupied
    protected Date rentStart = new Date();  //when did the lease start, if null - unoccupied.

    //constructor
    public Rental(int propertyID, float rentAmt, int lease, String location, int beds, int renterID, Date rentStart) {
        this.propertyID = propertyID;
        this.rentAmt = rentAmt;
        this.lease = lease;
        this.location = location;
        this.beds = beds;
        this.renterID = renterID;
        this.rentStart = rentStart;
    }

    public int getPropertyID() {
        return this.propertyID;
    }

    public float getBeds() {
        return this.beds;
    }

    public void setRentAmt(float rentAmt) {
        this.rentAmt = rentAmt;
    }

    public float getrentAmt() {
        return this.rentAmt;
    }

    public void setRenterID() {
        //todo;
    }

    public int getRenterID() {
        return this.renterID;
    }
}
