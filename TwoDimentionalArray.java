public class TwoDimentionalArray {
  public static void main(String[] args) {
      int [][] matrix = new int[3][4];

      matrix[0][0] = 1; matrix[0][1] = 2; matrix[0][2] = 3; matrix[0][3] = 4;
      matrix[1][0] = 5; matrix[1][1] = 6; matrix[1][2] = 7; matrix[1][3] = 8;
      matrix[2][0] = 9; matrix[2][1] = 10; matrix[2][2] = 11; matrix[2][3] = 12;

      int [][] matrix2 = {
          {10, 20, 30, 40},
          {50, 60, 70, 80},
          {90, 100, 110, 120}
      };

      for (int row=0; row<matrix.length; row++) {
          for (int col=0; col<matrix[row].length; col++) {
              System.out.print(matrix[row][col] + " ");
          }
          System.out.println();
      }

      System.out.println("=====================================");
      for (int matrixRow[] : matrix2) {
          for (int matrixCol : matrixRow) {
              System.out.print(matrixCol + " ");
          }
          System.out.println();
      }

  }
}
