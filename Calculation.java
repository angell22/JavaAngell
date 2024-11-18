public class Calculation {
    int SyafigAge = 16;
    double SyafigHeight = 5.6;
    double BMI = (SyafigAge + SyafigHeight) / 2;
    public static void main(String[] args) {
        Calculation myCalculation = new Calculation();
        System.out.println("Syafig's age is " + myCalculation.SyafigAge);
        System.out.println("Syafig's height is " + myCalculation.SyafigHeight);
        System.out.println("Syafig's BMI is " + myCalculation.BMI);
    }
}