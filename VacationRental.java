package project;
import java.util.*;
public class VacationRental extends Rental {

    public VacationRental(int propertyID, float rentAmt, int lease, String location, int beds, int renterID, Date rentStart) {
        super(propertyID, rentAmt, 1, location, beds, renterID, rentStart);
    }

    @Override
    public void billing() {

    };

}
