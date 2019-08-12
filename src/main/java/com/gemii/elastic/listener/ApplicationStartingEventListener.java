package com.gemii.elastic.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-07-22 13:52
 * @since JDK 1.8
 */

@Component
@Slf4j
public class ApplicationStartingEventListener implements ApplicationListener< ApplicationStartingEvent > {
    @Override
    public void onApplicationEvent( ApplicationStartingEvent event ) {
        log.info( "......ApplicationStartingEvent......" );
    }
}
