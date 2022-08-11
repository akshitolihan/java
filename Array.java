public class Array {
    public static void main(String[] args){
        int arr[][] = { 
            {1,2,3},
            {4,5,6},
            {7,8,9},
         };
         String employee[][] = { 
            {"empNo\t", "empName\t\t", "empDept\t\t", "empDesg\t\t", "empSal",},
            {"1\t","Akshit Kumar\t","CSE\t\t","AP\t\t","40000",},
         };

         for (int i =0 ; i < 2; i++) {
            for (int j =0 ; j < 5; j++) {
        System.out.print(employee[i][j]);
    }
    System.out.print("\n");
         }
    System.out.print(employee.length);

    }
}
