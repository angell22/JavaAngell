import java.util.Scanner;

public class SwitchCar {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the car model: ");
    String enteredModel = scanner.nextLine();

    System.out.println("Enter the car's price (RM): ");
    double enteredPrice = scanner.nextDouble();

    int buyerStatus = (enteredPrice > 100000) ? 1 : 2;
    switch (buyerStatus) {
      case 1:
        System.out.println("The buyer is a VIP!");
        break;
      case 2:
        System.out.println("The buyer is not a VIP!");
        break;
      default:
        System.out.println("Invalid!");
        break;
    }
  }
}