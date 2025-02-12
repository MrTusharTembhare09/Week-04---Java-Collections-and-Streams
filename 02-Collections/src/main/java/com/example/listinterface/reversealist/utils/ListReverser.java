package com.example.listinterface.reversealist.utils;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class ListReverser {

    // Reversing the list using a manual approach
    public static <T> void reverseList(List<T> list) {
        // Swapping elements from start to end
        int left = 0, right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}

