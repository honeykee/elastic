package com.gemii.elastic.repository;

import com.gemii.elastic.document.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-07-19 10:57
 * @since JDK 1.8
 */
public interface ItemRepository extends ElasticsearchRepository< Item, Long > {

}
