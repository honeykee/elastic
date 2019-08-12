package com.gemii.elastic.listener;

import com.gemii.elastic.event.UserRegisterEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-07-22 14:30
 * @since JDK 1.8
 */
@Component
@Slf4j
public class CommonListener {

    @EventListener(UserRegisterEvent.class )
    public void userRegisterListener( UserRegisterEvent userRegisterEvent ){
        log.info( "CommonListener userRegisterListener=== user :{}", userRegisterEvent.getUser() );

    }
}
