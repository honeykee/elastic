package com.gemii.elastic;

import com.gemii.elastic.event.UserRegisterEvent;
import com.gemii.elastic.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
@Slf4j
public class Application {

    public static void main( String[] args ) {
        SpringApplication.run( Application.class, args );
    }

    @Autowired
    UserService userService;

    @Autowired
    ApplicationContext applicationContext;

    @EventListener(ApplicationReadyEvent.class)
    public void applicationReadyEvent(){
        log.info( "applicationReadyEvent================" );
    }

    @EventListener( ApplicationStartedEvent.class)
    public void applicationStartedEvent(){
        log.info( "applicationStartedEvent================" );
        userService.registerUser();
    }

    @EventListener( ApplicationPreparedEvent.class)
    public void applicationPreparedEvent(){
        log.info( "applicationPreparedEvent================" );
    }
    @EventListener( ApplicationStartingEvent.class)
    public void applicationStartingEvent(){
        log.info( "applicationStartingEvent================" );
    }

    @EventListener(UserRegisterEvent.class)
    public void userRegisterEvent(UserRegisterEvent userRegisterEvent){
        log.info( "userRegisterEvent====== user {} " ,userRegisterEvent.getUser() );
    }

    @Autowired
    public void testAutowired(){
        log.info( "---------------" );
//        applicationContext.publishEvent( new User() );
    }

}
