package ArraysAndHashing;

import com.sun.jdi.Value;

import java.util.*;

public class ProductOfArrayExecptSelf {

    public int[] productOfArrayExepctSelf(int[] nums){
        int[] array = new int[nums.length] ;
        int preFix = 1;
        int postFix = 1;
        for(int i = 0; i < array.length; i++) {
            array[i] = preFix;
            preFix *= nums[i];
        }
        for(int j = array.length - 1; j >= 0; j--) {
            array[j] *= postFix;
            postFix *= nums[j];
        }

        return array;    }
}
