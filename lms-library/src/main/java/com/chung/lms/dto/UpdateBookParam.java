package com.chung.lms.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

public class UpdateBookParam {

    @NotEmpty
    @ApiModelProperty(value = "书籍id", required = true)
    private Long id;

    @ApiModelProperty(value = "国际标准书号")
    private String isbn;

    @ApiModelProperty(value = "书名")
    private String title;

    @ApiModelProperty(value = "主题")
    private String subject;

    @ApiModelProperty(value = "出版商")
    private String publisher;

    @ApiModelProperty(value = "语言")
    private String language;

    @ApiModelProperty(value = "页数")
    private Integer numberOfPages;

    @ApiModelProperty(value = "作者id")
    private Long authorId;
}
