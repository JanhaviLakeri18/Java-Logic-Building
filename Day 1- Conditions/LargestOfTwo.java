import java.util.Scanner;
public class LargestOfTwo{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b");
        int b = sc.nextInt();

        if(a > b){
            System.out.println("The Largest number is:" +a);
        } else if(a < b){
            System.out.println("The Largest number is:" +b);
        } else{
            System.out.println("Both numbers are equal");
        }


        sc.close();
    }
}