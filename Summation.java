import java.util.*;

class Summation{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n= sc.nextInt();

        int sum=0;

        for(int i=1;i<=n;i++){
            sum=sum+i;
            
        }
        System.out.println("Sum is = "+sum);
    }
}