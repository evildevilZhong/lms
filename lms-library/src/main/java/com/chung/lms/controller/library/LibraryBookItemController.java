package com.chung.lms.controller.library;

import com.chung.lms.common.api.CommonResult;
import com.chung.lms.dto.AddBookItemParam;
import com.chung.lms.dto.UpdateBookItemParam;
import com.chung.lms.model.LibraryBookItem;
import com.chung.lms.service.LibraryBookItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Api(tags = "LibraryBookItemController")
@Tag(name = "LibraryBookItemController", description = "图书馆藏书藏本管理")
@RequestMapping("/library/book-item")
public class LibraryBookItemController {

    @Autowired
    LibraryBookItemService bookItemService;

    @ApiOperation("新增藏本")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@RequestBody AddBookItemParam param) {
        LibraryBookItem bookItem = new LibraryBookItem();
        BeanUtils.copyProperties(param, bookItem);
        bookItemService.add(bookItem);
        return CommonResult.success(null);
    }

    @ApiOperation("更新藏本信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody UpdateBookItemParam param) {
        LibraryBookItem bookItem = new LibraryBookItem();
        BeanUtils.copyProperties(param, bookItem);
        bookItemService.updateById(bookItem);
        return CommonResult.success(null);
    }

    @ApiOperation("删除藏本")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@RequestParam Long id) {
        bookItemService.deleteById(id);
        return CommonResult.success(null);
    }
}
