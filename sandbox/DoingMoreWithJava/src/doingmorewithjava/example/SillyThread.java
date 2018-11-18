/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doingmorewithjava.example;

/**
 *
 * @author mythr
 */
public class SillyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread id: "
                                + Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(100);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
            SillyThread aSillyThread = new SillyThread();
            aSillyThread.start();
        }
    }
}
