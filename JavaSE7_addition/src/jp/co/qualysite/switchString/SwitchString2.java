package jp.co.qualysite.switchString;

public class SwitchString2 {

    private final static Integer ONE = new Integer(1);
    
    public static void main(String[] args) {
        Integer integer = ONE;
        switch(integer){// switch���̏����� Integer�Ȃǃ��b�p�[�N���X��OK
            case 0:// case�Ŕ�r����Ƃ��ɁA�I�[�g�{�N�V���O�����
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
// ���s���ʁFONE���\�������