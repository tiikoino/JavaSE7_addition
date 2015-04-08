package jp.co.qualysite.trywithresources;

import java.io.*;

class CloseSampleSe6 {

    public static void copy(String dest, String src){

        InputStream in = null;
        OutputStream out = null;

        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(dest);

            int len;
            byte[] b = new byte[1024];
            while ((len = in.read(b)) != -1) {
                out.write(b, 0, len);
            }

        } catch(IOException e){
            e.printStackTrace();

        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ignore) {
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ignore) {
                }
            }
        }
    }

    public static void main(String[] args){

        String src = "hoge.txt";
        String dest = "hoge2.txt";

        copy(dest, src);

        System.out.println("END");
    }

}
