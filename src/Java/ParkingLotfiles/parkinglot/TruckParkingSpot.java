package Java.ParkingLotfiles.parkinglot;

import Java.ParkingLotfiles.vehicles.Vehicle;

public class TruckParkingSpot extends ParkingSpot {

    public TruckParkingSpot(int spotNumber) { super(spotNumber, "Truck"); }


    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "Truck".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
