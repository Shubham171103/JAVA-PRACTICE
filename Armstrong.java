import java.util.*;

class Armstrong {
    public static void main(String args[]) {
        int n;
        
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = sc.nextInt();
            int m = n;
        while (n > 0) {
            int r = n % 10;
            sum = sum + r * r * r;
            n = n / 10;
        }

        if (m == sum) {
            System.out.println("Given number is armstrong number");
        } else {
            System.out.println("Given number is not armstrong number");
        }
        sc.close();
    }
}