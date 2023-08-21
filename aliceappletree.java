import java.util.*;
public class aliceappletree {
    static int minAplles(int M, int K, int N, int S, int W, int E)
    {
        if(M <= S*K)
            return M;
        else if (M <= S*K+E+W)
            return S*K+(M-S*K);
        else
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of apples to be collected:");
        int M = sc.nextInt();
        System.out.println("Enter No of apples for each tree:");
        int K = sc.nextInt();
        System.out.println("Enter No of trees in North:");
        int N = sc.nextInt();
        System.out.println("Enter No of trees in South:");
        int S = sc.nextInt();
        System.out.println("Enter No of trees in WEST:");
        int W = sc.nextInt();
        System.out.println("Enter No of trees in East:");
        int E = sc.nextInt();

        int ans = minAplles(M, K, N, S, W, E);
        System.out.println(ans);

    }
}
