package net.xdclass.base_project.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author hdz
 * @ClassName AsyncTask
 * @Description 异步任务业务类
 * @Date 2020/05/19 14:09
 * @Version 1.0
 **/
@Component
@Async
public class AsyncTask {

    /**
     * @author hdz
     * @Description 异步任务1，打印任务耗时
     * @Date 14:10 2020/05/19
     **/
    public void task1() throws InterruptedException{
        long begin = System.currentTimeMillis();
        Thread.sleep(1000L);
        long end = System.currentTimeMillis();
        System.out.println("任务1耗时="+(end-begin));
    }

    /**
     * @author hdz
     * @Description 异步任务2，打印任务耗时
     * @Date 14:10 2020/05/19
     **/
    public void task2() throws InterruptedException{
        long begin = System.currentTimeMillis();
        Thread.sleep(2000L);
        long end = System.currentTimeMillis();
        System.out.println("任务2耗时="+(end-begin));
    }

    /**
     * @author hdz
     * @Description 异步任务3，打印任务耗时
     * @Date 14:10 2020/05/19
     **/
    public void task3() throws InterruptedException{
        long begin = System.currentTimeMillis();
        Thread.sleep(3000L);
        long end = System.currentTimeMillis();
        System.out.println("任务3耗时="+(end-begin));
    }

    //获取异步结果

    /**
     * @author hdz
     * @Description 异步任务4，打印任务耗时，返回结果
     * @Date 14:10 2020/05/19
     **/
    public Future<String> task4() throws InterruptedException{
        long begin = System.currentTimeMillis();
        Thread.sleep(2000L);
        long end = System.currentTimeMillis();
        System.out.println("任务4耗时="+(end-begin));
        return new AsyncResult<String>("任务4");
    }

    /**
     * @author hdz
     * @Description 异步任务5，打印任务耗时，返回结果
     * @Date 14:10 2020/05/19
     **/
    public Future<String> task5() throws InterruptedException{
        long begin = System.currentTimeMillis();
        Thread.sleep(3000L);
        long end = System.currentTimeMillis();
        System.out.println("任务5耗时="+(end-begin));
        return new AsyncResult<String>("任务5");
    }

    /**
     * @author hdz
     * @Description 异步任务6，打印任务耗时，返回结果
     * @Date 14:10 2020/05/19
     **/
    public Future<String> task6() throws InterruptedException{
        long begin = System.currentTimeMillis();
        Thread.sleep(1000L);
        long end = System.currentTimeMillis();
        System.out.println("任务6耗时="+(end-begin));
        return new AsyncResult<String>("任务6");
    }
}
