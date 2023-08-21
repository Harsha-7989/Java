import java.util.Arrays;

public class mergesort {
       public static void main(String[] args)  {
        int[] arr = {5,3,6,7,9,4,1};
        int[] ans = merge(arr);
        System.out.println(Arrays.toString(ans));
        } 
        static int[] merge(int[] arr)
        {
                if(arr.length == 1){
                        return arr;
                }
                int mid = arr.length/2;

                int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
                int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

                return merger(left, right);


        }


        static int [] merger(int[] first, int[] second){
                int[] mix = new int[first.length + second.length];
  
                int i = 0;
                int j = 0;
                int k = 0;
                while(i < first.length && j < second.length)
                {
                        if(first[i] < second[j]){
                                mix[k] = first[i];
                                i++;
                                
                        }
                        else{
                                mix[k] = second[j];
                                j++;
        

                        }
                        k++;
                }
                // copying the remaining elements
                while(i < first.length){
                        mix[k] = first[i];
                        i++;
                        k++;
                }
                 while(j < second.length){
                        mix[k] = second[j];
                        j++;
                        k++;
                }
                return mix;

        }
}
