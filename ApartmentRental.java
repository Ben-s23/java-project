package project;

import java.util.*;

public class ApartmentRental extends Rental {
    private Boolean commonArea;
    private Boolean fitnessCenter;
    private Boolean utilityRoom;

    public ApartmentRental(int rentalID, float rentAmt, int lease, String location, int beds, int renterID, Date rentStart, Boolean commonArea, Boolean fitnessCenter, Boolean utilityRoom) {
        super(rentalID, rentAmt, 180, location, beds, renterID, rentStart);
        this.commonArea = commonArea;
        this.fitnessCenter = fitnessCenter;
        this.utilityRoom = utilityRoom;
    }

    @Override
    public void billing() {

    };
}
