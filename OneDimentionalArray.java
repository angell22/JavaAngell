public class OneDimentionalArray {

  public static void main(String[] args){
      int[] numbers = new int[5];
      numbers[0] = 10;
      numbers[1] = 20;
      numbers[2] = 30;
      numbers[3] = 40;
      numbers[4] = 50;

      int[] numbers2 = {10, 20, 30, 40, 50};

      System.out.println(numbers[3]);

      for (int i = 0; i < 5; i++) {
          System.out.println(numbers[i]);
      }

      for (int number: numbers) {
          System.out.println(number);
      }

  }
  
}
