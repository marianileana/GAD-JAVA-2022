package lab4.exceptions.example;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void exceptionMethod(int i) throws IOException{
        if(i == 1)
            throw new IOException();

    }

    public static int test(){
        try{
            System.out.println(-1);
            exceptionMethod(1);
            System.out.println(0);
        } catch (IOException e){
            System.out.println(1);
            return 1;
        } finally {
            System.out.println(2);
            //return 2;
        }
        System.out.println("after finnaly");
        return 2;
    }

    public static void main(String[] args) {
        System.out.println("result=" + test());
    }
}
