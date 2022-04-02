package lab1.ch2;

public class FooBarQix {
    public static String compute(int i){
        String s = "";
        if (i % 3 == 0) s += "Foo";
        if (i % 5 == 0) s += "Bar";
        if (i % 7 == 0) s += "Qix";

        int nr, l = 0;
        int[] digits = new int[100];
        nr = i;
        while(nr>0){
            digits[l] = nr % 10;
            nr = nr / 10;
            l++;
        }

        for (int j = l-1; j >= 0; j--) {
            if (digits[j] == 3) s += "Foo";
            else if (digits[j] == 5) s += "Bar";
            else if (digits[j] == 7) s += "Qix";
        }

        if (!s.isEmpty())
            return s;
        else return String.valueOf(i);
    }

    public static String compute2(int i){
        String s = "";
        boolean ok = true;

        if (i % 3 == 0){
            ok = false;
            s += "Foo";
        }
        if (i % 5 == 0){
            ok = false;
            s += "Bar";
        }
        if (i % 7 == 0){
            ok = false;
            s += "Qix";
        }

        int nr, l = 0;
        int[] digits = new int[100];
        nr = i;
        while(nr>0){
            digits[l] = nr % 10;
            nr = nr / 10;
            l++;
        }


        for (int j = l-1; j >= 0; j--) {
            if (digits[j] == 3) s += "Foo";
            else if (digits[j] == 5) s += "Bar";
            else if (digits[j] == 7) s += "Qix";
            else if (digits[j] == 0) s += "*";
            else if (ok) s += digits[j];
        }

        return s;
    }

    public static void main(String[] args) {

        System.out.println("compute = " + compute(15));

        System.out.println("compute2 = " + compute2(105));

    }
}


