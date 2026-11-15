package ArraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();

        for(int n : nums) {
            h.merge(n,1, Integer::sum);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(h.entrySet());
        list.sort(Map.Entry.comparingByValue());

        int[]j = new int[k];

        for(int i = 0; i < k; i++) {
            j[i] = list.get(list.size() - i - 1).getKey();
        }

        return j;

    }
}
