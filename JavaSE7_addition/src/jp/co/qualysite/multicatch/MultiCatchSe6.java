package jp.co.qualysite.multicatch;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultiCatchSe6 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);  // ArithmeticException î≠ê∂
            FileReader fr = new FileReader("a.txt"); // FileNotFoundException î≠ê∂
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
