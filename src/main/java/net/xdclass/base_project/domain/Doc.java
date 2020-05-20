/*
package net.xdclass.base_project.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

*/
/**
 * @author hdz
 * @ClassName Doc
 * @Description 文档的实体Bean
 * @Date 2020/05/20 9:16
 * @Version 1.0
 **//*

@Data
@NoArgsConstructor
@Accessors(chain = true)
@Document(indexName = "ems", type = "_doc", shards = 1, replicas = 0)
public class Doc {

    @Id
    private Long id;

    @Field(type = FieldType.Keyword)
    private String firstCode;

    @Field(type = FieldType.Keyword)
    private String secondCode;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String content;

    @Field(type = FieldType.Integer)
    private Integer type;

    public Doc(Long id,String firstCode,String secondCode,String content,Integer type) {
        this.id = id;
        this.firstCode = firstCode;
        this.secondCode = secondCode;
        this.content = content;
        this.type = type;
    }
}

*/
