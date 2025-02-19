package Java.ParkingLotfiles.gates;

import Java.ParkingLotfiles.parkinglot.ParkingLot;
import Java.ParkingLotfiles.parkinglot.ParkingSpot;
import Java.ParkingLotfiles.vehicles.Vehicle;
import Java.ParkingLotfiles.vehicles.VehicleFactory;

import java.util.Scanner;

public class EntranceGate {
    private ParkingLot parkingLot;

    public EntranceGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    // Method to process the vehicle entrance
    public void processEntrance() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the vehicle license plate: ");
        String licensePlate = scanner.next();
        System.out.println("Enter the vehicle type (Car, Bike or Truck): ");
        String vehicleType = scanner.next();

        Vehicle vehicle = VehicleFactory.createVehicle(vehicleType, licensePlate);
        if (vehicle == null) {
            System.out.println("Invalid vehicle type! Only Car, Bike and Truck are allowed.");
            return;
        }

        // Try to park the vehicle
        ParkingSpot spot = parkingLot.parkVehicle(vehicle);
        if (spot != null) {
            System.out.println("Vehicle parked successfully in spot: " + spot.getSpotNumber());
        } else {
            System.out.println("No available spots for the current vehicle type.");
        }
    }
}

