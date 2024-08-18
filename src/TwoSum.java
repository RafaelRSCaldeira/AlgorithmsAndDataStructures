import java.util.HashMap;

public class TwoSum {
    public static int[] sum(int[] arr, int target) {
        HashMap<Integer, Integer> nums = new HashMap<>();
        for(int num: arr) {
            if(nums.containsKey(target-num)) {
                return new int[] {target-num, num};
            }
            nums.put(num, num);
        }
        return new int[0];
    }
}
