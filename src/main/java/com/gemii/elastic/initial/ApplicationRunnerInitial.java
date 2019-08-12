package com.gemii.elastic.initial;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-07-22 11:58
 * @since JDK 1.8
 */

@Component
@Slf4j
@Order(100)
public class ApplicationRunnerInitial implements ApplicationRunner {
    @Override
    public void run( ApplicationArguments args ) throws Exception {
        log.info( "ApplicationRunnerInitial===================" );
    }
}
