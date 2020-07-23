package com.jtfr.producer;

import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jtfr.message.Demo01Message;

@Component
public class Demo01Producer {

    /**
     * 自动创建  创建一个 RocketMQ DefaultMQProducer 生产者，不需要使用autoConfiguartion
     */
    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    public SendResult syncSend(Integer id) {
        // 创建 Demo01Message 消息
        Demo01Message message = new Demo01Message();
        message.setId(id);
        // 同步发送消息
        return rocketMQTemplate.syncSend(Demo01Message.TOPIC, message);
    }

    public void asyncSend(Integer id, SendCallback callback) {
        // 创建 Demo01Message 消息
        Demo01Message message = new Demo01Message();
        message.setId(id);
        // 异步发送消息
        rocketMQTemplate.asyncSend(Demo01Message.TOPIC, message, callback);
    }

    public void onewaySend(Integer id) {
        // 创建 Demo01Message 消息
        Demo01Message message = new Demo01Message();
        message.setId(id);
        // oneway 发送消息
        rocketMQTemplate.sendOneWay(Demo01Message.TOPIC, message);
    }

}