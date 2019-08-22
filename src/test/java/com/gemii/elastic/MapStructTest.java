package com.gemii.elastic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gemii.elastic.mapper.UserDtoMapper;
import com.gemii.elastic.pojo.User;
import com.gemii.elastic.pojo.UserDTO;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-08-22 16:52
 * @since JDK 1.8
 */

public class MapStructTest {
    User user = null ;

    JSONObject jsonObject = new JSONObject(  );

    ObjectMapper mapper = new ObjectMapper(  );

    /**
     * 模拟从数据库中查出user对象
     */
    @Before
    public void before() {
        user  = new User("11", "zhangsan", "12345","shanghai" ,"address1");
    }


    /**
     * 模拟通过MapStruct把user对象转换成UserRoleDto对象
     */
    @Test
    public void test2() {
        List<UserDTO> userDTO = UserDtoMapper.INSTANCES.userToUserDTOList( Arrays.asList( user ) );
        try {
            System.out.println("userDTO : " + mapper.writeValueAsString( userDTO ));

        } catch ( JsonProcessingException e ) {
            e.printStackTrace();
        }
    }

}
