package Java.ParkingLotfiles.parkinglot;

import Java.ParkingLotfiles.vehicles.Vehicle;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;

    // Constructor to initialize the parking lot with multiple floors
    public ParkingLot(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    // for finding an available spot across all floors based on vehicle type
    public ParkingSpot findAvailableSpot(String vehicleType) {
        for (ParkingFloor floor : floors) {
            ParkingSpot spot = floor.findAvailableSpot(vehicleType);
            if (spot != null) {
                return spot; // found an available spot for the vehicle type
            }
        }
        return null; // not found available spot for the vehicle type
    }

    // method to park a vehicle
    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findAvailableSpot(vehicle.getVehicleType());
        if (spot != null) {
            spot.parkVehicle(vehicle);
            System.out.println("Vehicle parked successfully in spot: " + spot.getSpotNumber());
            return spot;
        }
        System.out.println("No parking spots available for " + vehicle.getVehicleType() + "!");
        return null;
    }

    // method to vacate a parking spot
    public void vacateSpot(ParkingSpot spot, Vehicle vehicle) {
        if (spot != null && spot.isOccupied() && spot.getVehicle().equals(vehicle)) {
            spot.vacate(); // free the spot
            System.out.println(vehicle.getVehicleType() + " vacated the spot: " + spot.getSpotNumber());
        } else {
            System.out.println("Invalid operation! Either the spot is already vacant or the vehicle does not match.");
        }
    }

    // method to find a spot by its number as we have tickets generated for this
    public ParkingSpot getSpotByNumber(int spotNumber) {
        for (ParkingFloor floor : floors) {
            for (ParkingSpot spot : floor.getParkingSpots()) {
                if (spot.getSpotNumber() == spotNumber) {
                    return spot;
                }
            }
        }
        return null; // spot not found
    }

    // Getter for floors
    public List<ParkingFloor> getFloors() {
        return floors;
    }
}
