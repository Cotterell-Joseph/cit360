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
public class SimpleRunnableStarter {
    
    public static void main(String[] args) {
        for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
            SimpleRunnable aSimpleRunnable = new SimpleRunnable();
            Thread aSimpleThread = new Thread(aSimpleRunnable);
            aSimpleThread.start();
        }
    }
}
