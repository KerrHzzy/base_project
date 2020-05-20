/*
package net.xdclass.base_project.service;

import net.xdclass.base_project.domain.Doc;
import org.springframework.data.domain.Page;

import java.util.Iterator;
import java.util.List;

*/
/**
 * @author hdz
 * @ClassName IElasticService
 * @Description 搜索引擎的业务实现接口类
 * @Date 2020/05/20 9:29
 * @Version 1.0
 **//*

public interface ElasticService {

    void createIndex();

    void deleteIndex(String index);

    void save(Doc docBean);

    void saveAll(List<Doc> list);

    Iterator<Doc> findAll();

    Page<Doc> findByContent(String content);

    Page<Doc> findByFirstCode(String firstCode);

    Page<Doc> findBySecondCode(String secondCode);

    Page<Doc> query(String key);
}
*/
