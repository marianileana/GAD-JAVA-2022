package lab8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class Streams1 {
    public static void ex1() {
        List<Integer> numbers = IntStream.range(0,11)
                .boxed()
                .map(current -> current.getClass().getName() )
                .map(current -> {
                    System.out.println(current);
                    return current.length();
                })
                .collect(toList());
        System.out.println(numbers);
    }

    public static void ex2(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,4,8,6,4));
        Integer max = list.stream().reduce((x, y) -> x > y ? x : y)
                .get();
        System.out.println(max);
    }

    public static void ex3(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,4,8,6,4));
        Integer sum = list.stream().reduce(0, (x,y) -> x + y);
        System.out.println(sum);
    }

    public static void ex4(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Ana","are", "mere"));
        Map<String, Integer> res = words.stream()
                .collect(toMap(identity(), e -> e.length()));
        System.out.println(res);
    }

    public static void ex5(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,7,3));
        Optional i = list.stream().max(Integer::compareTo);

        if(!i.isEmpty())
            System.out.println(i.get());
    }

    public static void ex6(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("src/lab8/input.txt"));
            String line = br.readLine();
            int max = line.length();
            String lineMax = line;
            while( line != null ) {
                if( max<line.length() ) {
                    max = line.length();
                    lineMax = line;
                }
                line = br.readLine();
            }
            System.out.println(lineMax);
        } catch(Exception e ) {
            e.printStackTrace();
        }
    }

    public static void ex7(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/lab8/input.txt"));
            String list1 = Files.lines(Paths.get("src/lab8/input.txt"))
                    .toList()
                    .stream()
                    .max((x,y) -> x.length() > y.length() ? 1 : -1)
                    .get();
            System.out.println(list1);
        } catch(Exception e ) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int res = IntStream
                .range(0,11)
                .filter(e -> {
                    System.out.println(e);
                    return e %2 ==0;
                })
                .map(e -> {
                    System.out.println("----->" + e);
                    return e * 10;
                })
                .findFirst().getAsInt();

    }
}