package lab1.ch2;

public class FooBarQix {
    public static String compute(int i){
        String s = "";
        if (i % 3 == 0) s += "Foo";
        if (i % 5 == 0) s += "Bar";
        if (i % 7 == 0) s += "Qix";

        int digit, nr;
        nr = i;
        while(nr>0){
            digit = nr % 10;
            nr = nr / 10;

            if (digit == 3) s += "Foo";
            else if (digit == 5) s += "Bar";
            else if (digit == 7) s += "Qix";
        }

        if (!s.isEmpty())
            return s;
        else return String.valueOf(i);
    }

    public static void main(String[] args) {

        System.out.println(compute(33));

    }
}


