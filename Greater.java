import java.util.*;

class Greater{
    public static void main(String args[]){
        int x,y;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter First Number (x): ");
        x=sc.nextInt();
        System.out.println("Enter Second Number (y): ");
        y=sc.nextInt();

        if(x==y){
            System.out.println("both numbers are equal");
        }
        else if(x>y){
            System.out.println("First number(x) is greater");
        }
        else{
            System.out.println("second number(y) is greater");
        }
    }
}