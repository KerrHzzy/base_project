package net.xdclass.base_project;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @author hdz
 * @ClassName XdClassApplication
 * @Description XdClass Application的启动类
 * @Date 2020/05/19 13:40
 * @Version 1.0
 **/
@SpringBootApplication //一个注解顶下面3个
@MapperScan("net.xdclass.base_project.mapper")
@EnableScheduling	//开启定时任务
@EnableAsync   //开启异步任务
@EnableJms
public class XdClassApplication {

    @Bean
    public Queue queue(){
        return new ActiveMQQueue("common.queue");
    }

    @Bean
    public Topic topic(){
        return new ActiveMQTopic("video.topic");
    }

    public static void main(String[] args) {
        SpringApplication.run(XdClassApplication.class, args);
    }

    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerTopic( ConnectionFactory activeMqConnectionFactory) {
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setPubSubDomain(true);
        bean.setConnectionFactory(activeMqConnectionFactory);
        return bean;
    }
}
