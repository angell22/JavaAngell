import java.util.Scanner; // Import the Scanner class

public class CarImport {
    private static class Car { 
        String model;
        String make;
        double price;

        public Car(String model, String make, double price) {
            this.model = model;
            this.make = make;
            this.price = price;
        }
    }

    private static class PriceAverage { 
        public static double calculateAveragePrice(Car[] cars) {
            double totalPrice = 0.0;

            for (Car car : cars) {
                totalPrice += car.price;
            }

            return totalPrice / cars.length;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];

        for (int i = 0; i < cars.length; i++) {
            System.out.println("\nEnter details for car " + (i + 1) + ": ");

            System.out.print("Enter model: ");
            String enteredModel = scanner.nextLine();

            System.out.print("Enter make: ");
            String enteredMake = scanner.nextLine();

            System.out.print("Enter price: ");
            double enteredPrice = scanner.nextDouble();
            scanner.nextLine();

            cars[i] = new Car(enteredModel, enteredMake, enteredPrice);
        }

        double averagePrice = PriceAverage.calculateAveragePrice(cars);
        System.out.println("\nThe average price of the cars is: " + averagePrice);
    }
}