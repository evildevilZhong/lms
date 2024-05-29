package com.chung.lms.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@EqualsAndHashCode
public class UpdateBookItemParam {

    @NotEmpty
    @ApiModelProperty(value = "书籍藏本id", required = true)
    private Long id;

    @ApiModelProperty(value = "最近被借日期")
    private Date borrowedDate;

    @ApiModelProperty(value = "租借到期日期")
    private Date dueDate;

    @ApiModelProperty(value = "书籍价格")
    private String price;

    @ApiModelProperty(value = "书籍状态")
    private String status;

    @ApiModelProperty(value = "最近借阅人id")
    private Long borrowMemberId;

    @ApiModelProperty(value = "图书二维码识别码")
    private String barcode;

    @ApiModelProperty(value = "书籍id")
    private Long libraryBookId;

    @ApiModelProperty(value = "书籍存放位置")
    private String location;

    @ApiModelProperty(value = "预约会员id")
    private Long reservationMemberId;

    @ApiModelProperty(value = "预约到期时间")
    private Date reservationDueDate;
}
