package ArraysAndHashing;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class LongestConsecutiveSequence {

    public int longestConsecutiveSequence(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        ArrayList<Integer> hej = new ArrayList<>();

        int n = nums[0];
        int count = 1;

        for(int i = 0; i <nums.length; i++) {
            if(nums[i] == n +1) {
                n = nums[i];
                count++;
            }
            if(nums[i] == n){
                continue;
            }
            else {
                hej.add(count);
                count = 1;
                n = nums[i];
            }
        }
        hej.add(count);
        hej.sort(null);
        return hej.getLast();
    }
}
