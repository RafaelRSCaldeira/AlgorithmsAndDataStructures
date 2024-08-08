public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        testPointer(arr);
        testPointer2(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void testPointer(int[] arr) {
        arr[0] = 10;
        arr[1] = 20;
        return;
    }

    private static void testPointer2(int[] arr) {
        int[] arr2 = {0, 1, 2, 3, 4, 5};
        arr2[0] = -1;
        return;
    }
}
