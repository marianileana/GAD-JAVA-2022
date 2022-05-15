package lab5.ex1v2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void sum(List<? extends Number> list){
        return list.get(0).doubleValue();
    }

/*    public static Object sum(List<? extends Integer> list){
        list.get(0);
        return list.get(0);
    }*/

    public static void main(String[] args) {
        List strings = new ArrayList();
        strings.add("Something");
        strings.add(new Date());

        for(Object o: strings){
            try{
                String s = (String) o;
                System.out.println(s);
            } catch (ClassCastException e){
                System.out.println("Class Cast Exception");
            }

        }

        List<String> strings2 = new ArrayList<String>();
        strings2.add("sasas");
        for(String s: strings2){
            System.out.println(s.toLowerCase());
        }
    }
}