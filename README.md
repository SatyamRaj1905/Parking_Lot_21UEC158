# Parking Lot System 🚗🏍️🚚

## Overview

This project implements a **Parking Lot System** with multiple floors, supporting different types of vehicles. The system efficiently manages parking space allocation and retrieval while adhering to object-oriented principles based on UML class diagram attached in pdf form

## Features ✅

- Multi-floor parking with a fixed number of spots per floor.
- Supports different vehicle types: **Car, Bike, and Truck**.
- Smart space allocation:
  - 🏍 **Bike** → 1 spot
  - 🚗 **Car** → 1 spot
  - 🚚 **Truck** → 2 consecutive spots
- Assigns the nearest available parking spot.
- Allows vehicles to exit, freeing up their spots.
- Provides querying features:
  - Number of available spots per floor.
  - Whether the parking lot is full.
  - Current location of a parked vehicle.

## System Requirements 💻
- Java 8 or higher

## 📂 Directory Structure 
```bash

Directory structure:
└── satyamraj1905-parking_lot_21uec158/
    ├── ParkingLot_21UEC158.iml
    └── src/
        └── Java/
            └── ParkingLotfiles/
                ├── gates/
                │   ├── EntranceGate.java
                │   └── ExitGate.java
                ├── main/
                │   └── Main.java
                ├── parkinglot/
                │   ├── BikeParkingSpot.java
                │   ├── CarParkingSpot.java
                │   ├── ParkingFloor.java
                │   ├── ParkingLot.java
                │   ├── ParkingSpot.java
                │   ├── Ticket.java
                │   └── TruckParkingSpot.java
                └── vehicles/
                    ├── BikeVehicle.java
                    ├── CarVehicle.java
                    ├── OtherVehicle.java
                    ├── TruckVehicle.java
                    ├── Vehicle.java
                    └── VehicleFactory.java

```
## Installation 📥

```bash
# Clone the repository
git clone https://github.com/SatyamRaj1905/Parking_Lot_21UEC158.git
cd parking-lot-system

```

## Design Principles 🏗️

- **Object-Oriented Design** (OOP)

- **Clean and modular code using S.O.L.I.D Principles**

- **Optimized lookup** for fast vehicle retrieval

## Future Enhancements 🔮

- Add automated payment processing
- Implement a GUI for better user experience

## Contributing 🤝

Feel free to fork the repository and submit pull requests!



