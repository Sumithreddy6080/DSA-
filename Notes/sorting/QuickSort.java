
import java.util.Arrays;

public class QuickSort {Arrays.asList(arr)
        int[] arr = {1,2,3,5,4,9,8,};
        
        sort(arr,0,6);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int low =start;
        int high = end;
        int p=arr[low];
        while(low<=high){
            while(arr[low]<p) low++;
            while(arr[high]>p) high--;
            if(low<=high){
                int t = arr[low];
                arr[low]=arr[high];
                arr[high]= t;
                low++;
                high--;
            }
        }
        sort(arr,start,high);
        sort(arr,low,end);
    }
}
