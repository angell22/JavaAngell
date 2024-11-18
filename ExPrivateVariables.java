public class ExPrivateVariables {
  private String model;
  private String make;
  private double price;

  public  ExPrivateVariables(String model, String make, double price) {
    this.model = model;
    this.make = make;
    this.price = price;
  }

  public void displayCar() {
    String modelShow = "Model: ";
    String makeShow = "Make: ";
    String priceShow = "Price: ";

    System.out.println(modelShow + model);
    System.out.println(makeShow + make);
    System.out.println(priceShow + price);
  }

  public static void main(String[] args) {
    ExPrivateVariables epv = new ExPrivateVariables("Civic", "Honda", 5000000);
    epv.displayCar();
  }
}