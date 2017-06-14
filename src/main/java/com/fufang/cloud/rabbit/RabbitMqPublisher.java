package com.fufang.cloud.rabbit;

import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;

/**
 * Created by zhifu.chen on 2017/6/14.
 */
public class RabbitMqPublisher {
    public static void main(String[] args) {
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
    
        // send something
        RabbitTemplate template = new RabbitTemplate(cf);
        template.setMandatory(true);
        /**
         * confirm 主要是用来判断消息是否有正确到达交换机，如果有，那么就 ack 就返回 true；如果没有，则是 false。
         */
        template.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {
            @Override
            public void confirm(CorrelationData correlationData, boolean ack, String cause) {
                System.out.println("confirm--:correlationData:"+correlationData+",ack:"+ack+",cause:"+cause);
            }
        });
        /**
         * return 则表示如果你的消息已经正确到达交换机，但是后续处理出错了，那么就会回调 return，并且把信息送回给你（前提是需要设置了 Mandatory，不设置那么就丢弃）；
            如果消息没有到达交换机，那么不会调用 return 的东西。
         */
        template.setReturnCallback(new RabbitTemplate.ReturnCallback() {
            @Override
            public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
                System.out.println("return--message:"+new String(message.getBody())+",replyCode:"+replyCode+",replyText:"+replyText+",exchange:"+exchange+",routingKey:"+routingKey);
            }
        });
        template.convertAndSend("myExchange", "foo.bar", "Hello, world!");
    }
}
