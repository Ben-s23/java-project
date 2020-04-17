package project;

import java.util.*;

public class ApartmentRental extends Rental {
    private Boolean commonArea;
    private Boolean fitnessCenter;
    private Boolean utilityRoom;

    public ApartmentRental(int propertyID, float rentAmt, int lease, String location, int beds, int renterID, Date rentStart, Boolean commonArea, Boolean fitnessCenter, Boolean utilityRoom) {
        super(propertyID, rentAmt, 180, location, beds, renterID, rentStart);
        this.commonArea = commonArea;
        this.fitnessCenter = fitnessCenter;
        this.utilityRoom = utilityRoom;
    }

    public Boolean getCommonArea() {
        return this.commonArea;
    }

    public Boolean getFitnessCenter() {
        return this.fitnessCenter;
    }

    public Boolean getUtilityRoom() {
        return this.utilityRoom;
    }
}
