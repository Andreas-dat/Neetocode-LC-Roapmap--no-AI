package ArraysAndHashing;

import java.sql.Array;
import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List <String>> array = new ArrayList<>();
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        int count = 0;

        for(String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(!h.containsKey(key)) {
                h.put(key,count);
                count++;
                ArrayList<String> n = new ArrayList<>();
                n.add(s);
                array.add(n);
            }else{

                array.get(h.get(key)).add(s);
            }

        }

        return array;
    }
}
