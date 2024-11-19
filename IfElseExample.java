public class IfElseExample {
    public static void main(String[] args) {
        int num = -4;

        if (num>0 || num==0) {
            System.out.println("The number is positive");
        } else if (num %2 == 0 || num>0){ 
            System.out.println("The number is even");      
         } else {
            System.out.println("The number is not positive");
        }

        String result = (num>0) ? "positive" : "not positive";
        System.out.println("Ternary result: " + result);
    }
}