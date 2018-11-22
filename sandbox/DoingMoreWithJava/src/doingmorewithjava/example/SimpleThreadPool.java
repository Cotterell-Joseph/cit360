/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doingmorewithjava.example;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author mythr
 */
public class SimpleThreadPool {
    public static void main(String[] args) {
        Executor anExecutor = Executors.newCachedThreadPool();
        for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
            SimpleRunnable aSimpleRunnable = new SimpleRunnable();
            anExecutor.execute(aSimpleRunnable);
        }
        try {
            Thread.sleep(5000);
            System.out.println("Done Sleeping");
            for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
                SimpleRunnable aSillyRunnable = new SimpleRunnable();
                anExecutor.execute(aSillyRunnable);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
