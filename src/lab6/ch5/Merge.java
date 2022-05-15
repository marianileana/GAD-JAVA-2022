package lab6.ch5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Merge {
    public static List<Integer> mergeSorted(List<Integer> l1, List<Integer> l2){
        l1.addAll(l2);
        Collections.sort(l1);
        return l1;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,5,8,9));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(2,4,7,9,22));
        System.out.println(mergeSorted(l1,l2));
    }
}