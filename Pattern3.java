
import java.util.*;

public class Pattern3{
    public static void main(String args[]){
        int m,n;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter no of rows: ");
        n=sc.nextInt();
        System.out.println("Enter no of columns: ");
        m=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}