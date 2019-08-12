package com.gemii.elastic;

import com.gemii.elastic.document.Car;
import com.gemii.elastic.document.Depart;
import com.gemii.elastic.document.Person;
import com.gemii.elastic.repository.ItemRepository;
import com.gemii.elastic.repository.PersonRepository;
import org.apache.lucene.search.join.ScoreMode;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhang chuan sheng
 * @version 1.0
 * @date 2019-07-19 17:05
 * @since JDK 1.8
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PersonIndexTest {

    @Autowired
    ElasticsearchTemplate elasticsearchTemplate ;

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    PersonRepository personRepository;

    @Test
    public void testInsertPerson(){
        List< Car > cars = new ArrayList<>(  );
        Car car1 = new Car( 1L,"BUCK","君威" );
        Car car2 = new Car( 2L,"BMW","X3" );
        cars.add( car1 );
        cars.add( car2 );
        Depart depart = new Depart( 1L, "技术部" );

        Person person = new Person( 2L,"张川胜",25,"重庆市彭水县桑柘镇", "19999999999" ,cars, depart);

        personRepository.save( person );
    }

    @Test
    public void queryPerson(){
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        QueryBuilder queryBuilders = QueryBuilders.matchQuery( "depart.name", "开发部");

        queryBuilder.withQuery( queryBuilders );

        Page< Person > searchResult = personRepository.search( queryBuilder.build() );
        searchResult.forEach( person -> {
            System.out.println(person);
        } );

    }

    @Test
    public void nestQuery(){
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
//        QueryBuilder queryBuilder1 = QueryBuilders.matchQuery("depart.name", "开发部" );

//        QueryBuilder queryBuilder2 = QueryBuilders.nestedQuery( "cars",
//                QueryBuilders.boolQuery().
//                        must( QueryBuilders.matchQuery( "cars.name","昂科威" ) ) ,ScoreMode.Total );
        QueryBuilder queryBuilder2 = QueryBuilders.termQuery( "cars.name" ,"昂科威");


        QueryBuilder queryBuilder0 = QueryBuilders.boolQuery().must( queryBuilder2 );

        queryBuilder.withQuery( queryBuilder0 );

        Page< Person > searchResult = personRepository.search( queryBuilder.build() );
        searchResult.forEach( person -> System.out.println( "person: " + person) );


//        QueryBuilder orderItemsQuery = QueryBuilders.nestedQuery("orderItem.orderItems",
//                QueryBuilders.boolQuery()
//                        .must(QueryBuilders.matchQuery("orderItem.orderItems.stockSite", "0001"))
//                        .must(QueryBuilders.matchQuery("orderItem.orderItems.skuNo", "154018")),
//                ScoreMode.Total);
//
//        QueryBuilder orderQuery = QueryBuilders.nestedQuery("orderItem",
//                QueryBuilders.boolQuery()
//                        .must(QueryBuilders.matchQuery("orderItem.orderType", "RO"))
//                        .must(QueryBuilders.matchQuery("orderItem.orderDate", "20170708")),
//                ScoreMode.Total);
//
//        QueryBuilder queryBuilder3 = QueryBuilders.boolQuery().must(orderQuery).must(orderItemsQuery);
//
//        Iterable it = personRepository.search(queryBuilder2);

    }
}
