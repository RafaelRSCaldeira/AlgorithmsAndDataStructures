public class MergeSort implements Sort{

    public int[] sort(int[] arr) {
        mergeSort(arr, new int[arr.length], 0, arr.length - 1);
        return arr;
    }

   private static void mergeSort(int[] arr, int[] temp, int start, int end) {
    if(start >= end) {
        return;
    }
    int mid = (start + end) / 2;
    mergeSort(arr, temp, start, mid);
    mergeSort(arr, temp, mid + 1, end);
    merge(arr, temp, start, mid, end);
   }

   private static void merge(int[] arr, int[] temp, int start, int mid, int end) {
    System.arraycopy(arr, start, temp, start, end - start + 1);
    int left = start, right = mid + 1, current = start;
    while(left <= mid && right <= end) {
        if(temp[left] <= temp[right]) {
            arr[current++] = temp[left++]; 
        }
        else {
            arr[current++] = temp[right++];
        }
    }
    while(left <= mid) {
        arr[current++] = temp[left++];
    }
   }
}