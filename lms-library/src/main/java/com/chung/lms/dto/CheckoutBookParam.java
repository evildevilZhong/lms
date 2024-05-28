package com.chung.lms.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

@Data
@EqualsAndHashCode
public class CheckoutBookParam {
    @NotEmpty
    @ApiModelProperty(value = "借阅人会员卡条码",required = true)
    private String memberBarCode;
    @NotEmpty
    @ApiModelProperty(value = "图书藏本条码",required = true)
    private String bookItemBarCode;
}
