package jp.co.qualysite.multicatch;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultiCatchSe7 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);   // ArithmeticException ����
            FileReader fr = new FileReader("a.txt"); // FileNotFoundException ����
        }catch(FileNotFoundException | ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
