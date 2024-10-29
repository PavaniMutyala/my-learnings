import java.util.Scanner;
class Largest{
    public static void main(String args[]){
        Scanner n =new Scanner(System.in);
        System.out.println("Enter x number:");
        int x=n.nextInt();
        System.out.println("Enter y number:");
        int y=n.nextInt();
        System.out.println("Enter z number:");
        int z=n.nextInt();
        if(x>y && x>z)
        {
            System.out.println(x);
        }
        else if(y>x && y>z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }
        

    }
}