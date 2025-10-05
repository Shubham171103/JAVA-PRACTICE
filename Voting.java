import java.lang.*;
import java.util.*;

public class Voting {

    public static void main(String args[]){
        int age;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = sc.nextInt();

        if (age<0){
            System.out.println("Plese enter valid age");
        }
        else if(age>=18){
            System.out.println("You are eligible for voting");
        }
        else{
            System.out.println("you are not eligible for voting");
        }
        sc.close();
    }
}
