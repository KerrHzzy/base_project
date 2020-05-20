/*
package net.xdclass.base_project.service.impl;

import net.xdclass.base_project.dao.ElasticRepository;
import net.xdclass.base_project.domain.Doc;
import net.xdclass.base_project.service.ElasticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

*/
/**
 * @author hdz
 * @ClassName ElasticServiceImpl
 * @Description 搜索引擎的业务实现类
 * @Date 2020/05/20 9:31
 * @Version 1.0
 **//*

@Service("elasticService")
public class ElasticServiceImpl implements ElasticService {
*/
/*
    @Autowired
    private ElasticsearchRestTemplate elasticsearchTemplate;
    @Autowired
    private ElasticRepository elasticRepository;

    private final Pageable pageable = PageRequest.of(0,10);

    @Override
    public void createIndex() {
        elasticsearchTemplate.createIndex(Doc.class);
    }

    @Override
    public void deleteIndex(String index) {
        elasticsearchTemplate.deleteIndex(index);
    }

    @Override
    public void save(Doc docBean) {
        elasticRepository.save(docBean);
    }

    @Override
    public void saveAll(List<Doc> list) {
        elasticRepository.saveAll(list);
    }

    @Override
    public Iterator<Doc> findAll() {
        return elasticRepository.findAll().iterator();
    }

    @Override
    public Page<Doc> findByContent(String content) {
        return elasticRepository.findByContent(content, pageable);
    }

    @Override
    public Page<Doc> findByFirstCode(String firstCode) {
        return elasticRepository.findByFirstCode(firstCode, pageable);
    }

    @Override
    public Page<Doc> findBySecondCode(String secondCode) {
        return elasticRepository.findBySecondCode(secondCode, pageable);
    }

    @Override
    public Page<Doc> query(String key) {
        return elasticRepository.findByContent(key, pageable);
    }*//*

}
*/
