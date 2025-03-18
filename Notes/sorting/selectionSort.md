# Selection Sort Algorithm
## **Introduction**
Selection Sort is an in-place sorting algorithm that divides the array into two parts:  
- The sorted part (left side).
- The unsorted part (right side).  

It repeatedly selects the smallest element from the unsorted portion and swaps it with the first element of the unsorted part.

## **How It Works**
1. Start with the first element and assume it's the minimum.
2. Compare it with all remaining elements to find the actual minimum.
3. Swap the minimum element with the first element.
4. Move to the next element and repeat until the array is sorted.

## **Time Complexity**
| Case | Time Complexity |
|------|----------------|
| Best Case | **O(n²)** |
| Average Case | **O(n²)** |
| Worst Case | **O(n²)** |

## **Space Complexity**
- **O(1)** (In-place sorting)

## **Implementation in Java**
```java
import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Assume the first element is the minimum
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        System.out.println("Original Array: " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
