package com.gemii.elastic.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-07-22 13:52
 * @since JDK 1.8
 */
@Slf4j
@Component
public class ApplicationReadyEventListener implements ApplicationListener< ApplicationReadyEvent > {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        log.info("......ApplicationReadyEvent......");
    }

}
