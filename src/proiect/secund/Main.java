package proiect.secund;

public class Main {
    public static void main(String[] args) {

        FoodBowl foodBowl = new FoodBowl("green", 5);
        Cat cat = new Cat("Leo ", foodBowl);
        cat.setAge(3);

        try {
            System.out.println("cat1: " + cat);

            Cat cat2 = cat.clone();
            System.out.println("cat2: " + cat2);
            cat2.getFoodBowl().setColor("white");
            cat2.setAge(13);

            System.out.println("cat1: " + cat);
            System.out.println("cat2: " + cat2);
        }

        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}