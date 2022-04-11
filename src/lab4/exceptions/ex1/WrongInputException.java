package lab4.exceptions.ex1;

public class WrongInputException extends Exception{

    public WrongInputException(int i){
        super("The following value is not supported: " + i);
    }

}
