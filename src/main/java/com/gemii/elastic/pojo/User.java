package com.gemii.elastic.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-08-22 16:52
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;
    private String code;
    private String name;
    private String country;
    private String address;

}
