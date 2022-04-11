//package lab4.io.ch1;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class PhoneBook {
//
//    Contact[] contacts = new Contact[5000];
//    int count = 0;
//
//    public PhoneBook(String inputFile){
//        Scanner s = null;
//        String name;
//        String number;
//
//        try {
//            s = new Scanner(new BufferedReader((new FileReader(inputFile)));
//            while(s.hasNext()){
//                name = s.next();
//                number = s.next();
//                contacts[count++] = new Contact(name, number);
//            }
//        } finally {
//            if(s != null) s.Close();
//        }
//    }
//
//    public Contact getContactByName(String name){
//        for(int i = 0; i <= count; i++){
//            if(contacts[i].getName().equals(name))
//                return contacts[i];
//        }
//        return null;
//    }
//
//    @Override
//    public String toString() {
//        return "PhoneBook{" +
//                "contacts=" + Arrays.toString(contacts) +
//                ", count=" + count +
//                '}';
//    }
//}
