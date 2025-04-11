import java.util.Scanner;

public class vehicle {
    private String brand;
    private String fueltype;
    private int speed;
    

    //constructor
    public vehicle(String brand, int speed, String fueltype) {
        this.brand = brand;
        this.speed = speed;
        this.fueltype = fueltype;
    }

    public String getBrand() {
        return brand;
    }
    
    public String getfueltype() {
        return fueltype;
    }

    public int getSpeed() {
        return speed;
    }

    public void displayinfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fueltype);
        System.out.println("Speed: " + speed + " km/h");
    }
   
    public static void main(String args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brand of the vehicle: ");
        String brand = sc.nextLine();
        System.out.println("Enter the speed of the vehicle: ");
        int speed = sc.nextInt();
        System.out.println("Enter the fuel type of the vehicle: ");
        String fueltype = sc.nextLine();
        
        vehicle v = new vehicle(brand, speed, fueltype);
        v.displayinfo();
    }

    
}

class car extends vehicle {
    private int doors;
  

    //constructor
    public car(String brand, int speed, String fueltype, int doors) {
        super(brand, speed, fueltype);
        this.doors = doors;
       ;
    }

    public int getDoors() {
        return doors;
    }


    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Doors: " + doors);
    }
}

class motorcycle extends vehicle {
    private boolean hasSideca;
  

    //constructor
    public motorcycle(String brand, int speed, String fueltype, String type) {
        super(brand, speed, fueltype);
        this.type = type;
    }

    public String getType() {
        return type;
    }


    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Type: " + type);
    }
}