package proiect.secund;

public class FoodBowl implements Cloneable{
        private String color;
        private int size;

        public FoodBowl(String color, int size) {
            this.color = color;
            this.size = size;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setSize(int size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return "Food bowl {" +
                    "color=' " + color + '\'' +
                    ", size= " + size +
                    '}';
        }

        public FoodBowl clone() throws CloneNotSupportedException {
            return (FoodBowl)super.clone();
        }
}