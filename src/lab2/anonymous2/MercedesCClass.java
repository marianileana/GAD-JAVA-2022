package lab2.anonymous2;

public class MercedesCClass extends Car{

    public MercedesCClass(Engine e){
        super(e);
    }

    @Override
    public void start() {
        System.out.println("Start Mercedes");
    }

    @Override
    public void stop() {
        System.out.println("Stop Mercedes");
    }
}