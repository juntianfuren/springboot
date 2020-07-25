package com.jtfr.consumer;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.jtfr.message.Demo04Message;

@Component
@RocketMQMessageListener(topic = Demo04Message.TOPIC, consumerGroup = "demo04-A-consumer-group-" + Demo04Message.TOPIC)
public class Demo04AConsumer implements RocketMQListener<Demo04Message> {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void onMessage(Demo04Message message) {
        logger.info("[onMessage][--------A--------线程编号:{} 消息内容：{}]", Thread.currentThread().getId(), message);
        // <X> 注意，此处抛出一个 RuntimeException 异常，模拟消费失败
       // throw new RuntimeException("我就是故意抛出一个异常");
    }

}