package net.xdclass.base_project.service.impl;

import net.xdclass.base_project.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @author hdz
 * @ClassName ProducerServiceImpl
 * @Description 消息生产者
 * @Date 2020/05/20 11:17
 * @Version 1.0
 **/
@Service("producer")
public class ProducerServiceImpl implements ProducerService {

    /**
     * @Description 用来发送消息到broker的对象
     **/
    @Autowired
    private JmsMessagingTemplate jmsTemplate;

    @Autowired
    private Queue queue;

    /**
     * @author hdz
     * @Description 发送消息，destination是发送到的队列，message是待发送的消息
     * @Date 11:18 2020/05/20
     * @param destination  指定队列
     * @param message      消息
     **/
    @Override
    public void sendMessage(Destination destination, String message) {
        jmsTemplate.convertAndSend(destination, message);
    }

    /**
     * @author hdz
     * @Description 发送消息，发送到默认队列，message是待发送的消息
     * @Date 11:18 2020/05/20
     * @param message 消息
     **/
    @Override
    public void sendMessage(final String message) {
        jmsTemplate.convertAndSend(this.queue, message);
    }

    //=======发布订阅相关代码=========
    @Autowired
    private Topic topic;

    @Override
    public void publish(String msg) {
        jmsTemplate.convertAndSend(this.topic, msg);
    }
}
