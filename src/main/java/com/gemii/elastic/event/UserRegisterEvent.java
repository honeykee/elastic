package com.gemii.elastic.event;

import com.gemii.elastic.event.pojo.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-07-22 14:01
 * @since JDK 1.8
 */
@Getter
public class UserRegisterEvent extends ApplicationEvent {

    private User user;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public UserRegisterEvent( Object source ,User user) {
        super( source );
        this.user = user;
    }
}
