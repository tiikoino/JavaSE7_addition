package jp.co.qualysite.switchString;

public class SwitchString {

    private final static String A ="a";
    private final static String B ="b";
    
    public static void main(String[] args) {
        String str = new String("b");
        switch(str){// switch �����s���ɁA�������hashCode()���Ăяo��
            case A:
                System.out.println("A");
                break;
            case B: // hashCode()�̔�r�̏�Aequalus()�ɂē��e���r
                System.out.println("B");
                break;
            default:
                System.out.println("D");
                break;
        }
    }
}
// ���s���ʁFB���\�������