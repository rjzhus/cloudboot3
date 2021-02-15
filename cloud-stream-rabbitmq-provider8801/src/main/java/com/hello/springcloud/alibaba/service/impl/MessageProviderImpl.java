package com.hello.springcloud.alibaba.service.impl;

import com.hello.springcloud.alibaba.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

import javax.annotation.Resource;

import org.springframework.cloud.stream.messaging.Source;

import java.util.UUID;

/**
 * @author zrj
 * @date 2021/2/7
 * @since V1.0
 **/
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    /**
     * 消息发送管道
     * <p>
     * 注意：这样定义 private MessageChannel messageChannel;
     * 会出现如下异常
     * org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sendMessageController':
     * Injection of resource dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException:
     * Error creating bean with name 'messageProviderImpl': Injection of resource dependencies failed;
     */
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send( MessageBuilder.withPayload( serial ).build() );
        System.out.println( "*****serial: " + serial );
        return null;
    }
}
