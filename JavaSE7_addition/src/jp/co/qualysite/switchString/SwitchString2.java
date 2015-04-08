package jp.co.qualysite.switchString;

public class SwitchString2 {

    private final static Integer ONE = new Integer(1);
    
    public static void main(String[] args) {
        Integer integer = ONE;
        switch(integer){// switch文の条件に IntegerなどラッパークラスもOK
            case 0:// caseで比較するときに、オートボクシングされる
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
// 実行結果：ONEが表示される