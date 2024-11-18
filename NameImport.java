import java.util.Scanner; // Import the Scanner class

public class NameImport {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter your name: ");
        String enteredName = scanner.nextLine();
        System.out.println("Hello " + enteredName + "!");
    }
    
}