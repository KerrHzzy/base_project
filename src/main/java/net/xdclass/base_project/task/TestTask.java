package net.xdclass.base_project.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author hdz
 * @ClassName TestTask
 * @Description 定时任务业务类
 * @Date 2020/05/19 13:43
 * @Version 1.0
 **/
@Component
public class TestTask {

    /**
     * @author hdz
     * @Description 两秒执行一次Sum方法，打印当前系统时间
     * @Date 13:47 2020/05/19
     **/
    /*@Scheduled(fixedRate = 2000)
    public void sum() {
        System.out.println("当前时间："+new Date());
    }*/

    /**
     * @author hdz
     * @Description 两秒执行一次Sum2方法，打印当前系统时间
     * @Date 13:52 2020/05/19
     **/
    /*@Scheduled(fixedRateString="2000")
    public void sum2() throws InterruptedException{

        Thread.sleep(4000L);
        System.out.println("结束 当前时间:"+new Date());
    }*/

    /**
     * @author hdz
     * @Description cron一秒执行一次Sum3方法，打印当前系统时间
     * @Date 13:52 2020/05/19
     **/
    //@Scheduled(cron="*/1 * * * * *")
    public void sum3(){
        System.out.println("cron 每秒 当前时间:"+new Date());
    }
}
