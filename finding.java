import java.util.Scanner;
public class finding {
    public static void main(String[] args) {
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the num you want to find");
        n =s.nextInt();
        if(n>0){
            System.out.println("the given num is "+n+" is positive");

        }
        else if(n<0){
            System.out.println("the given num is "+n+" is negative");
        }
    }
}
