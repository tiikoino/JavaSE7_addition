package jp.co.qualysite.switchString;

public class SwitchString1 {

    public static void main(String[] args) {
        String obj = null;
        switch(obj){// switch �����s���ɁA�������hashCode()���Ăяo��
                    // ���̎��_�ŁAobj��null�Ȃ̂ŁA���s����NullPointerExcepiton����������
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
// ���s���ʁF���s����O����������