import java.util.Scanner;
public class Voting{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age:");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("The candidate is eligible for voting.");
        }else{
            System.out.println("The candidate is not eligible for voting.");
        }
        





        sc.close();
    }
}