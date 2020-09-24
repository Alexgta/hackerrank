package com.DataStrPlusAlgoritms.compare2Arrays;

import java.util.HashMap;
import java.util.List;

// is there 2 equals values in the Losts?
public class CompareAllValuesIn2Arrays {

    public boolean compare2Arrays(List<String> list1, List<String> list2) {
        // O(n^2)
        for (String vValue1 : list1) {
            for (String vValue2 : list2) {
                if (vValue1.equals(vValue2))
                    return true;
            }
        }
        return false;
    }

    public boolean compare2Arrays2(List<String> list1, List<String> list2) {
        // O(n)
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();

        for (String vValue : list1) {
            map.put(vValue, true);
        }

        for (String vValue2 : list2) {
            if (map.containsKey(vValue2))
                return true;
        }
        return false;
    }

}
