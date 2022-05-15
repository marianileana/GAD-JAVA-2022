package lab6.ch1;

import java.util.*;

public class Leaders {
    public static List<Integer> findLeaders(List<Integer> list ){
        List<Integer> leaders = new ArrayList<>();
        Collections.reverse(list);
        System.out.println(list);

        Iterator<Integer> it = list.iterator();
        Integer max = list.get(0);
        Integer current;
        leaders.add(max);

        while(it.hasNext()) {
            current = it.next();
            if( current > max) {
                max = current;
                leaders.add(current);
            }
        }

        return leaders;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,4,2,9,7,3));
        System.out.println(findLeaders(list));

        list = new ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
        System.out.println(findLeaders(list));


    }
}