public class PrivateVariables {
  private String name;
  private int age;
  private boolean isAlive;
  private long netWorth;
  private double salary;


  public PrivateVariables(String name, int age, boolean isAlive, long netWorth, double salary) {
      this.name = name;
      this.age = age;
      this.isAlive = isAlive;
      this.netWorth = netWorth;
      this.salary = salary;

  }

  public void displayDetails(){
      String nameShow = "Name ";
      String ageShow = "Age ";
      System.out.println(nameShow + name);
      System.out.println(ageShow + age);
      System.out.println("Is Alive " + isAlive);
      System.out.println("Net Worth " + netWorth);
      System.out.println("Salary " + salary);
  }

  public static void main(String[] args) {
      PrivateVariables pv = new PrivateVariables("Syafiq", 22, true, 5544554454444L, 5000);
      pv.displayDetails();
  }
}