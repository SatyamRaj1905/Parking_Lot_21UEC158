package Java.ParkingLotfiles.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private List<ParkingSpot> spots;  // list of parking spots on this floor
    private int floorNumber;  // give the current floor

    // Constructor to initialize the parking floor with a specific number of spots for cars, bikes and trucks
    public ParkingFloor(int floorNumber, int numOfCarSpots, int numOfBikeSpots, int numOfTruckSpots) {
        this.floorNumber = floorNumber;
        this.spots = new ArrayList<>();  // declaring the list of spots

        // Add spots for cars
        for (int i = 0; i < numOfCarSpots; i++) {
            this.spots.add(new CarParkingSpot(i + 1));  // Add car spots (using CarParkingSpot)
        }

        // Add spots for bikes
        for (int i = numOfCarSpots; i < numOfCarSpots + numOfBikeSpots; i++) {
            this.spots.add(new BikeParkingSpot(i + 1));  // Add bike spots (using BikeParkingSpot)
        }

        for (int i = numOfTruckSpots; i < numOfCarSpots + numOfBikeSpots + numOfTruckSpots; i++) {
            this.spots.add(new TruckParkingSpot(i + 1));  // Add truck spots (using TruckParkingSpot)
        }
    }



    // for finding an available spot based on the vehicle type
    public ParkingSpot findAvailableSpot(String vehicleType) {
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied() && spot.getSpotType().equalsIgnoreCase(vehicleType)) {
                return spot;  // returns the first available spot for the vehicle type
            }
        }
        return null;  // not found spot for given vehicle type
    }

    // returns all parking spots on this floor
    public List<ParkingSpot> getParkingSpots() {
        return spots;
    }
}
