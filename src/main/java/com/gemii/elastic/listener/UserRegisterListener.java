package com.gemii.elastic.listener;

import com.gemii.elastic.event.UserRegisterEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-07-22 14:28
 * @since JDK 1.8
 */
@Component
@Slf4j
public class UserRegisterListener implements ApplicationListener< UserRegisterEvent > {
    @Override
    public void onApplicationEvent( UserRegisterEvent event ) {
        log.info( "UserRegisterEvent...  user: {} ", event.getUser()  );
    }
}
