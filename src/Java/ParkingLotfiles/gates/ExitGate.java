package Java.ParkingLotfiles.gates;

import Java.ParkingLotfiles.parkinglot.ParkingLot;
import Java.ParkingLotfiles.parkinglot.ParkingSpot;
import Java.ParkingLotfiles.vehicles.Vehicle;


public class ExitGate {
    private ParkingLot parkingLot;

    public ExitGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void processExit(int spotNumber) {
        // find the spot first by number
        ParkingSpot spot = parkingLot.getSpotByNumber(spotNumber);

        if (spot == null || !spot.isOccupied()) {
            System.out.println("Invalid or vacant spot!");
            return;
        }

        // get the vehicle in the spot
        Vehicle vehicle = spot.getVehicle();
        if (vehicle == null) {
            System.out.println("No vehicle found in the spot!");
            return;
        }

        // vacate the spot
        parkingLot.vacateSpot(spot, vehicle);
        System.out.println("Spot vacated successfully!");
    }
}