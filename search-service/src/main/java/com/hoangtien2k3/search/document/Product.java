package com.hoangtien2k3.search.document;

import java.time.ZonedDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Document(indexName = "product")
@Setting(settingPath = "esconfig/elastic-analyzer.json")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private Long id;
    @Field(type = FieldType.Text, analyzer = "autocomplete_index", searchAnalyzer = "autocomplete_search")
    private String name;
    private String slug;
    @Field(type = FieldType.Double)
    private Double price;
    private Boolean isPublished;
    private Boolean isVisibleIndividually;
    private Boolean isAllowedToOrder;
    private Boolean isFeatured;
    private Long thumbnailMediaId;
    @Field(type = FieldType.Text, fielddata = true)
    private String brand;
    @Field(type = FieldType.Keyword)
    private List<String> categories;
    @Field(type = FieldType.Keyword)
    private List<String> attributes;
    @Field(type = FieldType.Date)
    private ZonedDateTime createdOn;
}
