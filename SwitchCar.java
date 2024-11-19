import java.util.Scanner;

public class SwitchCar {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please select the car model that you want to buy: [1] Honda , [2] Proton , [3] Perodua");
    int enteredModel = scanner.nextInt();

    double carPrice = 0;
    switch (enteredModel) {
      case 1:
        System.out.println("Car Model: Honda");
        carPrice = 200000;
        System.out.println("Car's Price: RM " + carPrice);
        System.out.println("The buyer is a VIP!");
        break;
      case 2:
        System.out.println("Car Model: Proton");
        carPrice = 95000;
        System.out.println("Car's Price: RM " + carPrice);
        System.out.println("The buyer is not a VIP!");
        break;
      case 3:
        System.out.println("Car Model: Perodua");
        carPrice = 100000;
        System.out.println("Car's Price: RM " + carPrice);
        System.out.println("The buyer is not a VIP!");
      default:
        System.out.println("Invalid!");
        break;
    }
  }
}