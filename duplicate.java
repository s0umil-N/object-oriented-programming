import java.util.Scanner;
 class duplicate {
    static int[] number;
    static int size;
    public static void main(String[]args){
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the size of the array: ");
      size = s.nextInt();
      number = new int[size];
      System.out.print("Enter "+ size +"numbers");
      for (int i=0; i<size; i++){
      number[i] = s.nextInt();
      }
      for (int i=0; i<size; i++){
         for (int j=0; j<size; j++){
            if (number[i] ==number[j]){
                System.out.println("duplicate exist");
            }
            else {
                System.out.println("duplicate does not exist");
            }
            
         }
      }
     s.close();
    }
}
