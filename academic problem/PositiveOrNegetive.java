import java.util.Scanner;
public class PositiveOrNegetive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > -1){
            System.out.println(n+" is a Positive Number");
        }
        else {
            System.out.println(n+" is a Negetive Number");
        }
    }
}
