# Bubble Sort Algorithm

## **Introduction**
Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process continues until the list is sorted.

## **How It Works**
1. Compare adjacent elements.
2. Swap them if they are in the wrong order.
3. Move to the next pair and repeat.
4. After each full pass, the largest element "bubbles up" to its correct position.
5. Repeat the process for the remaining elements until the array is sorted.

## **Time Complexity**
| Case | Time Complexity |
|------|----------------|
| Best Case (Already Sorted) | **O(n)** |
| Average Case | **O(n²)** |
| Worst Case (Reverse Sorted) | **O(n²)** |

## **Space Complexity**
- **O(1)** (In-place sorting)

## **Implementation in Java**
```java
import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int arr[]) {
        int n = arr.length-1;
        boolean swapped;
        
        for (int i = 0; i < n ; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped in inner loop, array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 5, 6};
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        bubbleSort(arr);
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

```



### **Dry Run Example**
#### **Input:** `[5, 2, 9, 1, 5, 6]`
#### **Iterations:**
1. **First Pass:** `[2, 5, 1, 5, 6, 9]`
2. **Second Pass:** `[2, 1, 5, 5, 6, 9]`
3. **Third Pass:** `[1, 2, 5, 5, 6, 9]` (Sorted)

### **Optimizations**
- If no swaps occur in a pass, the array is already sorted (**Best Case O(n)**).
- Reduced comparisons by ignoring already sorted elements.

---

Would you like me to implement Bubble Sort in **Python** as well? 🚀

