package jp.co.qualysite.switchString;

public class SwitchString6 {

    public static void main(String[] args) {
        Integer val = 100;
        switch(val){
            case 10:    System.out.println("case10 ");
            case 100:   System.out.println("case100 ");
            case 200:   System.out.println("case200 ");
            default:    System.out.println("Default");
        }
    }
}
// 実行結果：case100 case200 Default と表示される