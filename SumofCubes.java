import java.util.Scanner;

public class SumofCubes{
    public static void main(String[] args) {
        int number;
        int digit;
        digit = 0;
        int sum;
        sum = 0;
        int cube;
        System.out.print("Enter number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        while(number != 0){
            digit = number % 10;
            cube = digit * digit * digit;
            number /= 10;
            sum = sum + cube;
        }
        System.out.println(sum);
        
    }        
}