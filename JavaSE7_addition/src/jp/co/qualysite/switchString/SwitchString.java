package jp.co.qualysite.switchString;

public class SwitchString {

    private final static String A ="a";
    private final static String B ="b";
    
    public static void main(String[] args) {
        String str = new String("b");
        switch(str){// switch 文実行時に、文字列のhashCode()を呼び出す
            case A:
                System.out.println("A");
                break;
            case B: // hashCode()の比較の上、equalus()にて内容を比較
                System.out.println("B");
                break;
            default:
                System.out.println("D");
                break;
        }
    }
}
// 実行結果：Bが表示される