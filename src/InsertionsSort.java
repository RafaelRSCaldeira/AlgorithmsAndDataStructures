public class InsertionsSort implements Sort{

    public int[] sort(int[] arr) {
        int size = arr.length;
        for(int i = 0; i < size - 1; i++) {
            if(arr[i] > arr[i+1]) {
                int j = i;
                while(j >= 0 && arr[j] > arr[j+1]) {
                    swap(arr, j);
                    j--;
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int index) {
        int temp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = temp;
        return;
    }
}