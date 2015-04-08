package jp.co.qualysite.multicatch;

public class MultiChatchMain {
    public static void main(String[] args) {
        try {
            sample("b");
        } catch (BException | AException e) {
            e.boo();    //ココでコンパイルエラー発生
        }
    }
    public static void sample(String s) throws AException, BException{
        switch(s){
            case "a":
                throw new AException();
            case "b":
                throw new BException();
        }
    }
}
