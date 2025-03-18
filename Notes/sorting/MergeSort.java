
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = mergeSort(new int[]{10,9,8,7,6,5,4,3,2,1,},0,8);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr, int s, int e){
        if(s==e){
            return new int[]{arr[s]};
        }
        int m = (s+e)/2;
        int[] left = mergeSort(arr, s, m );
        int[] rigth = mergeSort(arr, m+1, e);

        return  merge(left,rigth);
    }
    static int[] merge(int[] left, int[] rigth){
        int[] mix = new int[left.length+rigth.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<rigth.length){
            if(left[i]<rigth[j]){
                mix[k]=left[i];
                i++;
            }else{
                mix[k]=rigth[j];
                j++;
            }
            k++;
        }

        while (i<left.length) {
            mix[k]=left[i];
                i++;
                k++;
        }

        while (j<rigth.length) {
            mix[k]=rigth[j];
                j++;
                k++;
        }
        return mix;
    }

}
