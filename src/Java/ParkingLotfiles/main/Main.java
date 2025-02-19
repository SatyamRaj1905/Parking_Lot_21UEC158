package Java.ParkingLotfiles.main;

import Java.ParkingLotfiles.gates.EntranceGate;
import Java.ParkingLotfiles.gates.ExitGate;
import Java.ParkingLotfiles.parkinglot.ParkingFloor;
import Java.ParkingLotfiles.parkinglot.ParkingLot;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // declaring the parking lot with one floor and four spots for simplicity
        ParkingFloor floor = new ParkingFloor(1, 4, 4,4);
        ArrayList<ParkingFloor> floors = new ArrayList<>();
        floors.add(floor);
        ParkingLot parkingLot = new ParkingLot(floors);

        // Initialize gates, passing both ParkingLot and PaymentService to ExitGate
        EntranceGate entranceGate = new EntranceGate(parkingLot);
        ExitGate exitGate = new ExitGate(parkingLot);

        // Start of the parking lot system
        System.out.println("\n=========================================");
        System.out.println("   Welcome to the Parking Lot System!   ");
        System.out.println("=========================================");

        boolean exit = false;
        while (!exit) {
            // show options
            showMenu();

            // storing the user given choice inside choise
            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    // parking a vehicle should be from the entrance gate
                    parkVehicle(entranceGate);
                    break;

                case 2:
                    // leaving a parking spot should be from the exit gate
                    vacateSpot(exitGate, scanner);
                    break;

                case 3:
                    // exit from the menu
                    exit = true;
                    System.out.println("Thank you for using the Parking Lot System!");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n******************************************************");
        System.out.println("Please choose an option from below:");
        System.out.println("1. Park a vehicle");
        System.out.println("2. Vacate a vehicle spot");
        System.out.println("3. Exit the system");
        System.out.println("******************************************************");
    }

    private static int getUserChoice(Scanner scanner) {
        return scanner.nextInt();
    }

    private static void parkVehicle(EntranceGate entranceGate) {
        entranceGate.processEntrance();
    }

    private static void vacateSpot(ExitGate exitGate, Scanner scanner) {
        System.out.println("Enter the spot number to vacate: ");
        int spotNumber = scanner.nextInt();
        exitGate.processExit(spotNumber);
    }
}
