import java.util.Scanner;

public class SumNumbers {

    public int sumIsEven(int a, int b) {

        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter First Number:");
            int x = obj.nextInt();

            System.out.println("Enter Second Number:");
            int y = obj.nextInt();

            int sum = x+y;
            System.out.println("\nResult: ");

            if((sum) % 2 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");

            }
        }
        return 0;
    }


    public static void main(String[] args){
        SumNumbers obj = new SumNumbers();
        obj.sumIsEven(2,5);
    }
}
