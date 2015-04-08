package jp.co.qualysite.trywithresources;

import java.sql.SQLException;

class Sample1 {

    public static void main(String[] args) {
        
        try (MyResource obj1 = new MyResource("obj1");
                MyResource obj2 = new MyResource("obj2")) {
            System.out.println("try �u���b�N���̏���");
            throw new SQLException();

        } catch (SQLException e) {
            System.out.println("catch �u���b�N�FSQLException");

        } catch (Exception e) {
            System.out.println("catch �u���b�N�FException");

        } finally {
            System.out.println("finally �u���b�N");
        }
    }
}
