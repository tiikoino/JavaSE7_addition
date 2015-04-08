package jp.co.qualysite.switchString;

public class SwitchString3 {

    public static void main(String[] args) {
        byte b = 100;
        switch(b){
            case 10:    System.out.println("10");
            case 100:   System.out.println("100");
            case 200:   System.out.println("200");  // byteの範囲を超えるため
        }
    }
}
// 実行結果：コンパイルエラーが発生する