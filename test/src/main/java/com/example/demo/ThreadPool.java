package com.example.demo;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author chenyuejun
 * @descripption
 * @date 2020/1/3 &{TIME}
 */
public class ThreadPool {
    public   static ThreadPoolExecutor threadPoolExecutor=  new ThreadPoolExecutor(70, 1600, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
}
