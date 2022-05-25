package proiect.secund;

public class Cat implements Cloneable {

        private String name;
        private int age;
        private FoodBowl foodBowl;

        public Cat(String name, FoodBowl foodbowl) {
            this.name = name;
            this.foodBowl = foodbowl;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public Cat clone() throws CloneNotSupportedException {
            Cat cat = (Cat)super.clone();
            cat.foodBowl = this.foodBowl.clone();
            return cat;
        }

        @Override
        public String toString() {
            return "Cat {" +
                    "name=' " + name + '\'' +
                    ", age= " + age +
                    ", food bowl= " + foodBowl +
                    '}';
        }

        public FoodBowl getFoodBowl() {
            return foodBowl;
        }
}

