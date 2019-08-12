package com.gemii.elastic.initial;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-07-22 11:59
 * @since JDK 1.8
 */
@Component
@Slf4j
@Order(1)
public class CommandLineRunnerInitial implements CommandLineRunner {
    @Override
    public void run( String... args ) throws Exception {
        log.info( "CommandLineRunnerInitial=====================" );
    }
}
