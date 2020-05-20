package net.xdclass.base_project.service;

import javax.jms.Destination;

/**
 * @author hdz
 * @ClassName ProducerService
 * @Description 消息生产
 * @Date 2020/05/20 11:14
 * @Version 1.0
 **/
public interface ProducerService {

    /**
     * 功能描述：指定消息队列，还有消息
     * @param destination  指定队列
     * @param message      消息
     */
    public void sendMessage(Destination destination, final String message);

    /**
     * 功能描述：使用默认消息队列， 发送消息
     * @param message 消息
     */
    public void sendMessage(final String message);

    /**
     * 功能描述：消息发布者
     * @param message 消息
     */
    public void publish(String message);
}
