package net.xdclass.base_project.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author mid0801
 * @ClassName OrderConsumer
 * @Description p2p消息消费者(订单)
 * @Date 2020/05/20 11:24
 * @Version 1.0
 **/
@Component
public class OrderConsumer {

    @JmsListener(destination="order.queue")
    public void receiveQueue(String text){
        System.out.println("OrderConsumer收到的报文为:"+text);
    }
}
