import java.util.Scanner;
class Vehicle {
    private String brand;
    private int speed;
    private String fuelType;

    // Constructor
    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Car Subclass
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Motorcycle Subclass
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "True" : "False"));
    }


// Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        System.out.println("VEHICLE MANAGEMENT SYSTEM");

        while (repeat) {
            System.out.print("\nWould you like to input a Car or Motorcycle? (car/motorcycle): ");
            String type = scanner.nextLine();

            if (type.equals("car")) {
                System.out.print("Enter Car Brand: ");
                String brand = scanner.nextLine();

                System.out.print("Enter Speed (km/h): ");
                int speed = scanner.nextInt();
                scanner.nextLine(); 

                System.out.print("Enter Fuel Type: ");
                String fuelType = scanner.nextLine();

                System.out.print("Enter Number of Doors: ");
                int doors = scanner.nextInt();
                scanner.nextLine(); 

                Car car = new Car(brand, speed, fuelType, doors);

                System.out.println("\nCAR DETAILS");
                car.displayInfo();

            } else if (type.equals("motorcycle")) {
                System.out.print("Enter Motorcycle Brand: ");
                String brand = scanner.nextLine();

                System.out.print("Enter Speed (km/h): ");
                int speed = scanner.nextInt();
                scanner.nextLine(); 

                System.out.print("Enter Fuel Type: ");
                String fuelType = scanner.nextLine();

                System.out.print("Has Sidecar? (true/false): ");
                boolean hasSidecar = scanner.nextBoolean();
                scanner.nextLine(); 

                Motorcycle moto = new Motorcycle(brand, speed, fuelType, hasSidecar);

                System.out.println("\nMOTORCYCLE DETAILS");
                moto.displayInfo();

            } else {
                System.out.println("Invalid input. Please type 'car' or 'motorcycle'.");
            }

            System.out.print("\nDo you want to add another vehicle? (yes/no): ");
            String again = scanner.nextLine();

            if (!again.equals("yes")) {
                repeat = false;
                System.out.println("Your use of the system is greatly appreciated!");
            }
        }

        scanner.close();
    }
}
