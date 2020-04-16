package project;
import java.util.*;
public class SingleRental extends Rental {
    private Boolean garage;
    private Boolean frontYard;
    private Boolean backYard;

    public SingleRental(int rentalID, float rentAmt, int lease, String location, int beds, int renterID, Date rentStart, Boolean garage, Boolean frontYard, Boolean backYard) {
        super(rentalID, rentAmt, 365, location, beds, renterID, rentStart);
        this.garage = garage;
        this.frontYard = frontYard;
        this.backYard = backYard;
    }

    @Override
    public void billing() {

    };

}
