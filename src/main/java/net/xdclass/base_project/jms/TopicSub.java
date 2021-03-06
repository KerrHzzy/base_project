package net.xdclass.base_project.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author mid0801
 * @ClassName TopicConsumer
 * @Description 消息订阅者
 * @Date 2020/05/20 13:34
 * @Version 1.0
 **/
@Component
public class TopicSub {

    @JmsListener(destination = "video.topic", containerFactory = "jmsListenerContainerTopic")
    public void receive1(String text) {
        System.out.println("video.topic 消费者：receive1="+text);
    }

    @JmsListener(destination = "video.topic", containerFactory = "jmsListenerContainerTopic")
    public void receive2(String text) {
        System.out.println("video.topic 消费者：receive2="+text);
    }

    @JmsListener(destination = "video.topic", containerFactory = "jmsListenerContainerTopic")
    public void receive3(String text) {
        System.out.println("video.topic 消费者：receive3="+text);
    }
}
