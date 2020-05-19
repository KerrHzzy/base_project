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
    @Scheduled(fixedRate = 2000)
    public void sum() {
        System.out.println("当前时间："+new Date());
    }
}
