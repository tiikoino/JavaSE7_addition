package jp.co.qualysite.trywithresources;

import java.sql.SQLException;

class Sample1 {

    public static void main(String[] args) {
        
        try (MyResource obj1 = new MyResource("obj1");
                MyResource obj2 = new MyResource("obj2")) {
            System.out.println("try ブロック内の処理");
            throw new SQLException();

        } catch (SQLException e) {
            System.out.println("catch ブロック：SQLException");

        } catch (Exception e) {
            System.out.println("catch ブロック：Exception");

        } finally {
            System.out.println("finally ブロック");
        }
    }
}
