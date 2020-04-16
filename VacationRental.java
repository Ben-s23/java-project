package project;
import java.util.*;
public class VacationRental extends Rental {

    public VacationRental(int rentalID, float rentAmt, int lease, String location, int beds, int renterID, Date rentStart) {
        super(rentalID, rentAmt, 1, location, beds, renterID, rentStart);
    }

    @Override
    public void billing() {

    };

}
