package com.chung.lms.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

@Data
@EqualsAndHashCode
public class AddBookItemParam {

    @NotEmpty
    @ApiModelProperty(value = "书籍价格", required = true)
    private String price;

    @ApiModelProperty(value = "书籍状态", required = true)
    private String status;

    @NotEmpty
    @ApiModelProperty(value = "图书二维码识别码", required = true)
    private String barcode;

    @NotEmpty
    @ApiModelProperty(value = "书籍id", required = true)
    private Long libraryBookId;

    @ApiModelProperty(value = "书籍存放位置")
    private String location;
}
