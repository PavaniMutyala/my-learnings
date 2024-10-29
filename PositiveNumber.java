import java.util.Scanner;
public class PositiveNumber  {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = n.nextInt();
        if(x>=0)
        {
            System.out.println("Positive");

        }
        else
        {
            System.out.println("Negative");
        }


    }
     
}
