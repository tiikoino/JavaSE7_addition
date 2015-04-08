package jp.co.qualysite.switchString;

public class SwitchString5 {

    public static void main(String[] args) {
        String dept = "sales";
        switch(dept){  // longはswitch文にて使用NG
            case "admin":   System.out.println("1001 ");
            case "sales":   System.out.println("1002 ");
            case "tech":   System.out.println("1003 ");
        }
    }
}
// 実行結果：1002と表示される