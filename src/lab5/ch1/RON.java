package lab5.ch1;

public class RON extends Currency {
    public RON(Integer value) {
        super(value);
    }

    @Override
    public String toString() {
        return "RON " + getValue();
    }
}