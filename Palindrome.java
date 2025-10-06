import java.util.*;

class Palindrome {
    public static void main(String args[]) {
        int n;
        int rev = 0;
        int m;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        n = sc.nextInt();
        m = n;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        if (m == rev) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
    }
}