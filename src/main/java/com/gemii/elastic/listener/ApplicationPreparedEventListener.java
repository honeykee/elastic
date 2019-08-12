package com.gemii.elastic.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-07-22 13:49
 * @since JDK 1.8
 */
@Slf4j
@Component
public class ApplicationPreparedEventListener implements ApplicationListener< ApplicationPreparedEvent > {
    @Override
    public void onApplicationEvent( ApplicationPreparedEvent event ) {
        log.info("......ApplicationPreparedEvent......");
    }
}
