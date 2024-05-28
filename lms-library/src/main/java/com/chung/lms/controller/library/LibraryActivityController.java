package com.chung.lms.controller.library;

import com.chung.lms.common.api.CommonResult;
import com.chung.lms.dto.CheckoutBookParam;
import com.chung.lms.service.LibraryActivityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@Api(tags = "LibraryActivityController")
@Tag(name = "LibraryActivityController", description = "图书馆核心活动")
@RequestMapping("/library/activity")
public class LibraryActivityController {

    @Autowired
    LibraryActivityService libraryActivityService;

    @ApiOperation("扫码借出书籍")
    @RequestMapping(value = "/checkout", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody CheckoutBookParam param) {
        libraryActivityService.checkoutBook(param.getMemberBarCode(), param.getBookItemBarCode());
        return CommonResult.success(null);
    }
}
