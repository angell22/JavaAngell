public class VariableScope {
  int instanceVariable = 10;
  static int staticVariable = 20;
  String instanceVariable2 = "Hello";

  public static void main(String[] args) {
      int localVariable = 30;
      System.out.println("Local Variable: " + localVariable);
      System.out.println("Static Variable: " + staticVariable);
      VariableScope vs = new VariableScope();
      System.out.println("Instance Variable: " + vs.instanceVariable);

      System.out.println("String Variable: " + vs.instanceVariable2);
  }
}