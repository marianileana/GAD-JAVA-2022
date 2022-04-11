package lab2.anonymous2;

import lab2.anonymous2.Engine;

public class Main {
    public static void main(String[] args) {
        DrivingCar car = new Audia4(new Engine());
        car.drive();
//        car.drive(new Engine(){
//            @Override
//            public void drive(){
//                super.drive();
//                System.out.println("Drive fast using turbo.");
//            }
//        });

        Car carM = new MercedesCClass(new Engine());
        carM.drive();
        carM.start();
        carM.stop();

        car.drive();
    }
}
