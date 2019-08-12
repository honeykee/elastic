package com.gemii.elastic.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-07-22 13:51
 * @since JDK 1.8
 */
@Slf4j
@Component
public class ApplicationStartedEventListener implements ApplicationListener< ApplicationStartedEvent > {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        log.info("......ApplicationStartedEvent......");
    }

}
