import java.util.Scanner;

public class test {
    public static void main(String[] args) throws NewException{
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        if (num < 0 || num > 10) {
            throw new NewException();
        }
        

        int result = factorial(num);
        System.out.println("Result: " + result);


        scanner.close();

    }
    
    public static int factorial(int numerator) {
        if (numerator == 1)
            return 1;
        return numerator * factorial(numerator-1);
    }
    
}
