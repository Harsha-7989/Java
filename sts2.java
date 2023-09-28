import java.util.Scanner;


public class sts2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        boolean[] bool = new boolean[num];
        
        for(int i =0; i<bool.length;i++)
        {
            bool[i] = true;
        }
        for(int i =2; i<Math.sqrt(num); i++)
        {
        if(bool[i] == true)
        {
            for(int j=(i*i); j<num; j=j+i){
                bool[i] = false;
            }
        }
    }
    System.out.println("List of prime numbers less than N");

    for(int i = 2; i<bool.length; i++){
        if(bool[i] == true){
            System.out.print(i+ " ");
        }
    }
    }

    
}
