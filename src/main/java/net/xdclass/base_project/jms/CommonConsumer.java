package net.xdclass.base_project.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author mid0801
 * @ClassName CommonConsumer
 * @Description p2p消息消费者(共通/默认)
 * @Date 2020/05/20 11:21
 * @Version 1.0
 **/
@Component
public class CommonConsumer {

    @JmsListener(destination="common.queue")
    public void receiveQueue(String text){
        System.out.println("CommonConsumer收到的报文为:"+text);
    }
}
