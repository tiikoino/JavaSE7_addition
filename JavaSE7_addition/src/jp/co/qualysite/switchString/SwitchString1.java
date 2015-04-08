package jp.co.qualysite.switchString;

public class SwitchString1 {

    public static void main(String[] args) {
        String obj = null;
        switch(obj){// switch 文実行時に、文字列のhashCode()を呼び出す
                    // この時点で、objがnullなので、実行時にNullPointerExcepitonが発生する
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
// 実行結果：実行時例外が発生する