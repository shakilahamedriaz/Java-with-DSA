import java.util.Scanner;
public class MaxNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int max_number;

        if(a>b && b > c){
            System.out.println("Max Number is: "+a);
        }
        else if(b > a && b > c){
            System.out.println("Max Number is: "+b);
        }
        else{
            System.out.println("Max Number is: "+c);
        }
    }
}
