package lab2.anonymous2;

public class Audia4 extends Car implements DrivingCar{

    public Audia4(Engine e){
        super(e);
    }
    @Override
    public void start() {
        System.out.println("Start Audi a4");
    }

    @Override
    public void stop() {
        System.out.println("Stop audi a4 ");
    }
}
