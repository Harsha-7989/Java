package harsha;

import java.util.*;

public class clases 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
        for(int i = 0; i<=1000;i++){
            if(armstrong(i)){
                System.out.println(i + "");
            }
        }

    }
    static boolean isPrime(int n)
    {
        if (n<=1){
            return false;
        }
        int c = 2;
        while(c*c <=n)
        {
            if(n % c == 0)
            {
                return false;
            }
            c++;
        }
        return c*c>n;

    }
    static boolean armstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0)
        {
            int rem = n % 10;
            n = n /10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
     
}
    
