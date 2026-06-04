import java.util.Scanner;

public class PostiveNegative{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("The given number is Negative");
        } else if(num > 0){
            System.out.println("The given Number is Positive");
        } else{
            System.out.println("The given number is Zero");
        }
           

        sc.close();
    }
}
