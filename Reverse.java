import java.util.*;

class Reverse {
    public static void main(String args[]) {
        int n;
        int rev = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        n=sc.nextInt();

        while(n>0){
            int r = n%10;
            rev = rev*10 + r;
            n = n/10;
        }
        System.out.println("Reverse number is " + rev);
    }
}