package com.gemii.elastic.mapper;

import com.gemii.elastic.pojo.User;
import com.gemii.elastic.pojo.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-08-22 16:54
 * @since JDK 1.8
 */

@Mapper(componentModel = "spring")
public interface UserDtoMapper {
    /**
     * 获取该类自动生成的实现类的实例
     * 接口中的属性都是 public static final 的 方法都是public abstract的
     */
    UserDtoMapper INSTANCES = Mappers.getMapper( UserDtoMapper.class );

    @Mappings({
            @Mapping(source="code", target="code"),
            @Mapping(source="name", target="name")
    })
    UserDTO userToUserDTO( User user);

    List<UserDTO > userToUserDTOList( List<User> user);
}
