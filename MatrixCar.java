public class MatrixCar {
 public static void main(String[] args) {
  String [][] carModel = new String[3][3];

  carModel[0][0] = "Model: Honda"; carModel[0][1] = "Model: Proton" ; carModel[0][2] = "Model: Perodua";
  carModel[1][0] = "Model: Toyota"; carModel[1][1] = "Model: Lexus"; carModel[1][2] = "Model: Tesla"; 
  carModel[2][0] = "Model: Volkswagen"; carModel[2][1] = "Model: BMW "; carModel[2][2] = "Model: Mitsubishi";
  
  double[][] carPrice = {
    {90000, 25000, 30000},
    {40000, 50000, 200000},
    {150000, 130000, 100000}
  };

  System.out.println("\nList of cars which values above RM 50,000:");
  System.out.println("========================================== \n");
  for (int row=0; row<carModel.length; row++) {
    for (int col=0; col<carModel[row].length; col++){
      if (carPrice[row][col]>50000) {
        System.out.println(carModel[row][col] + " Price: RM " + carPrice[row][col]);
      }
    }
  }
 }
}
