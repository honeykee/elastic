package com.gemii.elastic.repository;

import com.gemii.elastic.document.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-07-19 16:39
 * @since JDK 1.8
 */
public interface PersonRepository extends ElasticsearchRepository< Person,Long > {
}
