package cn.victorplus.vehicle.service;

import cn.victorplus.vehicle.config.ThreadPools;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolService {

    private static volatile AtomicInteger num = new AtomicInteger(1);
    public static void main(String[] args) {
        ThreadPools.executor(3,() ->{
            System.out.println(Thread.currentThread().getName() +"  ########## 获取品牌信息");
            ThreadPools.executor(7,() -> {
                System.out.println(Thread.currentThread().getName() +"  ########## 获取车系信息");
                ThreadPools.executor(7,() -> {
                    System.out.println(Thread.currentThread().getName() +"  ########## "+ num.getAndAdd(1) +"获取车型信息");
                });
            });
        });
        try {
            System.out.println("=========================" + 3*7*7 +"====" + num);
            System.out.println(Thread.currentThread().getName() +"  ########## task finished over");
        } catch (Exception e) {
            System.out.println("error message ");
        }
    }
}
