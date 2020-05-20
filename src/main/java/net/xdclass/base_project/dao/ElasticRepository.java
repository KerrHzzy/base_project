package net.xdclass.base_project.dao;

import net.xdclass.base_project.domain.Doc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author hdz
 * @ClassName ElasticRepository
 * @Description 搜索引擎的业务Dao层
 * @Date 2020/05/20 9:25
 * @Version 1.0
 **/
public interface ElasticRepository extends ElasticsearchRepository<Doc, Long> {

    Page<Doc> findByContent(String content, Pageable pageable);

    Page<Doc> findByFirstCode(String firstCode, Pageable pageable);

    Page<Doc> findBySecondCode(String secondCode, Pageable pageable);
}

