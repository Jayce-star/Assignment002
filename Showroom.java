#import java.util.Scanner;

public class Showroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for inputs
        System.out.println("Enter car brand: ");
        String brand = scanner.nextLine();

        System.out.println("Enter car model: ");
        String model = scanner.nextLine();

        System.out.println("Enter car year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter fuel type: ");
        String fuelType = scanner.nextLine();

        // Create Car object
        Car car = new Car(brand, model, year, fuelType);

        // Display details
        car.displayDetails();
      
    }
}
 Assignment002
