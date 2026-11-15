package ArraysAndHashing;

public class TwoSum {

    public int[] twosum(int[] nums, int target) {
        int count = 0;
        for(int j = 0; nums.length > j; j++) {
            count++;
            for(int i = count; i < nums.length; i++) {
                if (nums[j] + nums[i] == target) {
                    int[] array = {j, i};
                    return array;
                }
            }
        }
        return null;
    }
}
