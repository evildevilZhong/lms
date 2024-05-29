package com.chung.lms.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

@Data
@EqualsAndHashCode
public class AddBookParam {

    @NotEmpty
    @ApiModelProperty(value = "国际标准书号", required = true)
    private String isbn;

    @NotEmpty
    @ApiModelProperty(value = "书名", required = true)
    private String title;

    @NotEmpty
    @ApiModelProperty(value = "主题", required = true)
    private String subject;

    @NotEmpty
    @ApiModelProperty(value = "出版商", required = true)
    private String publisher;

    @NotEmpty
    @ApiModelProperty(value = "语言", required = true)
    private String language;

    @NotEmpty
    @ApiModelProperty(value = "页数", required = true)
    private Integer numberOfPages;

    @NotEmpty
    @ApiModelProperty(value = "作者id", required = true)
    private Long authorId;
}
