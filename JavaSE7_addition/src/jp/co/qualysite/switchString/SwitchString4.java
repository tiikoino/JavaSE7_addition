package jp.co.qualysite.switchString;

public class SwitchString4 {

    public static void main(String[] args) {
        long l = 2;
        switch(l){  // longはswitch文にて使用NG
            case 1:   System.out.println("Case1");
            case 2:   System.out.println("Case1");
            case 3:   System.out.println("Case1");
            default:    System.out.println("Default");
        }
    }
}
// 実行結果：コンパイルエラーが発生する