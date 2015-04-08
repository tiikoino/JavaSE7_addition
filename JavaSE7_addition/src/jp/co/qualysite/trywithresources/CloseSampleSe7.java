package jp.co.qualysite.trywithresources;

import java.io.*;

class CloseSampleSe7 {

    public static void copy(String dest, String src) {

        try(InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dest); ) {

            int len;
            byte[] b = new byte[1024];
            while ((len = in.read(b)) != -1) {
                out.write(b, 0, len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){

        String src = "hoge.txt";
        String dest = "hoge2.txt";

        copy(dest, src);

        System.out.println("END");
    }
}
