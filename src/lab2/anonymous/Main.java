package lab2.anonymous;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive(new Engine());
        car.drive(new Engine(){
            @Override
            public void drive(){
                super.drive();
                System.out.println("Drive fast using turbo.");
            }
        });
    }
}
