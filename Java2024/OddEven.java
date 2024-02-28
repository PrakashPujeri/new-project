import java.util.Scanner;

/**
 * OddEven
 */
public class OddEven {

    public static void main(String[] args) {
        int n;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        n=s.nextInt();
        if(n%2==0){
            System.out.println("The number is Even number!!");

        }
        else{
            System.out.println("The number is Odd number!!");
        }

        
    }
}