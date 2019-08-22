package com.gemii.elastic.service;

import com.gemii.elastic.event.UserRegisterEvent;
import com.gemii.elastic.event.pojo.User;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-07-22 14:13
 * @since JDK 1.8
 */
@Service
public class UserService implements ApplicationContextAware {

    ApplicationContext applicationContext ;

    @Override
    public void setApplicationContext( ApplicationContext applicationContext ) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void registerUser(){
        User user = new User();
        user.setName( "张川胜" );
        user.setPassword( "123456" );
        applicationContext.publishEvent( new UserRegisterEvent(this, user ) );
    }


}
