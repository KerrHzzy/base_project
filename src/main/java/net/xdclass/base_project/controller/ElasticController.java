/*
package net.xdclass.base_project.controller;

import lombok.extern.log4j.Log4j2;
import net.xdclass.base_project.domain.Doc;
import net.xdclass.base_project.service.ElasticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

*/
/**
 * @author hdz
 * @ClassName ElasticController
 * @Description 搜索引擎业务控制类
 * @Date 2020/05/20 9:38
 * @Version 1.0
 **//*

@Log4j2
@RestController
@RequestMapping("/elastic")
public class ElasticController {

    @Autowired
    private ElasticService elasticService;

    @GetMapping("/init")
    public void init(){

        elasticService.createIndex();
        List<Doc> list =new ArrayList<>();
        list.add(new Doc(1L,"XX0193","XX8064","xxxxxx",1));
        list.add(new Doc(2L,"XX0210","XX7475","xxxxxxxxxx",1));
        list.add(new Doc(3L,"XX0257","XX8097","xxxxxxxxxxxxxxxxxx",1));
        elasticService.saveAll(list);
    }

    @GetMapping("/delete")
    public void deleteIndex() {
        String index = "ems";
        elasticService.deleteIndex(index);
    }

    @GetMapping("/save")
    public void saveDoc() {
        Doc docBean = new Doc(4L,"XX0300","XX8104","sdfdsfsdfsdfsfsfsdf",1);
        elasticService.save(docBean);
    }

    @GetMapping("/all")
    public Iterator<Doc> all(){
        return elasticService.findAll();
    }

    @GetMapping("/find_by_content")
    public Page<Doc> findByContent(String content){
        return elasticService.findByContent(content);
    }

    @GetMapping("/find_by_first_code")
    public Page<Doc> findByFirstCode(String firstCode){
        return elasticService.findByFirstCode(firstCode);
    }

    @GetMapping("/find_by_second_code")
    public Page<Doc> findBySecondCode(String secondCode){
        return elasticService.findBySecondCode(secondCode);
    }
}
*/
