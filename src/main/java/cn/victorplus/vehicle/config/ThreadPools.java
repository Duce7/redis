package cn.victorplus.vehicle.config;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Slf4j
public class ThreadPools {
    private static volatile ThreadPools threadPools = null;

    //corePoolsSize
    private static final int corePoolSize = 8;

    private static final int maxPoolSize = 24;

    private static final long keepAliveTime = 60L;


    private static final TimeUnit unit = TimeUnit.SECONDS;

    private static final ArrayBlockingQueue<Runnable> arrayBlockingQueue = new ArrayBlockingQueue(8);

    private static ThreadPoolExecutor threadPoolExecutor = null;

    private ThreadPools() {
        Executors.newSingleThreadExecutor();
        threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,maxPoolSize,keepAliveTime,unit,arrayBlockingQueue, Executors.defaultThreadFactory(),new ThreadPoolExecutor.CallerRunsPolicy());
    }

    public static void  executor(int num, Runnable runnable) {
        if (num <= 0) {
            return;
        }
        //DCL双端检锁机制
        if (null == threadPools) {
            synchronized (ThreadPools.class) {
                if (null == threadPools) {
                    threadPools = new ThreadPools();
                }
            }
        }

        for (int i = 0; i < num; i++) {
            log.info("================线程 {}",i);
            threadPoolExecutor.execute(runnable);
        }

//        threadPoolExecutor.shutdown();
    }

    public static void shutdown() {
        if (null != threadPools) {
            threadPoolExecutor.shutdown();
        }
    }
}
