package com.fufang.cloud.rabbit;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;

/**
 * Created by zhifu.chen on 2017/6/14.
 */
public class RabbitMqConsumer {
    public static void main(final String... args) {
        CachingConnectionFactory cf = new CachingConnectionFactory("127.0.0.7", 5672);
        cf.setUsername("guest");
        cf.setPassword("guest");
        cf.setPublisherConfirms(true);
        cf.setPublisherReturns(true);//必须设置 rabbitTemplate.setMandatory(true);才会起作用
        // set up the queue, exchange, binding on the broker
        RabbitAdmin admin = new RabbitAdmin(cf);
        Queue queue = new Queue("myQueue");
        admin.declareQueue(queue);
        TopicExchange exchange = new TopicExchange("myExchange");
        admin.declareExchange(exchange);
        admin.declareBinding(BindingBuilder.bind(queue).to(exchange).with("foo.*"));
        
        // set up the listener and container
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(cf);
        //手动确认
        container.setAcknowledgeMode(AcknowledgeMode.MANUAL);
        container.setMessageListener(new ChannelAwareMessageListener() {
            @Override
            public void onMessage(Message message, Channel channel) throws Exception {
                try {
                    System.out.println("consumer--:" + message.getMessageProperties() + ":" + new String(message.getBody()));
                    channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
                } catch (Exception e) {
                    e.printStackTrace();
                    channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);
                }
            }
        });
        container.setQueueNames("myQueue");
        container.start();
    }
}
