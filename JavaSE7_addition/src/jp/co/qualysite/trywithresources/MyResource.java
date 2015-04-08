/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.qualysite.trywithresources;

class MyResource implements AutoCloseable {

    private String msg;

    public MyResource(String msg) {
        this.msg = msg;
    }

    @Override
    public void close() throws Exception {
        System.out.println("close() : " + msg);
    }
}
