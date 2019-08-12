package com.gemii.elastic.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-07-19 11:31
 * @since JDK 1.8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document( indexName = "person_index",type = "person", shards = 3, replicas = 1 )
public class Person {
    @Id
    private Long id;
    @Field(type = FieldType.Keyword , analyzer = "ik_max_word", searchAnalyzer = "ik_smart")
    private String name;
    @Field(type = FieldType.Integer )
    private Integer age;
    @Field(type = FieldType.Text, analyzer = "ik_max_word" , searchAnalyzer = "ik_smart" )
    private String address;
    @Field(type = FieldType.Keyword )
    private String phone;
    @Field(type = FieldType.Nested )
    private List<Car> cars;
    @Field(type = FieldType.Object )
    private Depart depart ;

}
