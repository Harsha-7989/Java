

public class ceiling
{
    public static void main(String[] args) 
    {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 20;
        int ans = ceilings(arr, target);
        System.out.println(ans);

    }
    // find the element greater than target
    static int ceilings (int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return arr[start];
    }

}


