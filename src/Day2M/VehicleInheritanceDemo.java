// Parent class: Vehicle
class Vehicle {
    protected int speed;
    protected String fuelType;

    // Constructor (removed return type)
    Vehicle(int speed, String fuelType) { 
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public void displayDetails() {
        System.out.println("Speed: " + speed + " km/h, Fuel Type: " + fuelType);
    }
}

// Child class: Car (inherits from Vehicle)
class Car extends Vehicle {
    protected int numDoors;

    // Constructor
    Car(int speed, String fuelType, int numDoors) {
        super(speed, fuelType);
        this.numDoors = numDoors;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Doors: " + numDoors);
    }
}

// Grandchild class: ElectricCar (inherits from Car)
class ElectricCar extends Car {
    private int batteryCapacity;

    // Constructor
    ElectricCar(int speed, String fuelType, int numDoors, int batteryCapacity) {
        super(speed, fuelType, numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery: " + batteryCapacity + " kWh");
    }
}

// Main class to test the hierarchy
public class VehicleInheritanceDemo {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar(120, "Electric", 4, 80);
        tesla.displayDetails();
    }
}
