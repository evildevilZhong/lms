package com.chung.lms.controller.library;

import com.chung.lms.common.api.CommonResult;
import com.chung.lms.dto.AddBookParam;
import com.chung.lms.dto.UpdateBookParam;
import com.chung.lms.model.LibraryBook;
import com.chung.lms.service.LibraryBookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Api(tags = "LibraryBookController")
@Tag(name = "LibraryBookController", description = "图书馆收录书籍管理")
@RequestMapping("/library/book")
public class LibraryBookController {

    @Autowired
    LibraryBookService bookService;

    @ApiOperation("新增收录书籍信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@RequestBody AddBookParam param) {
        LibraryBook book = new LibraryBook();
        BeanUtils.copyProperties(param, book);
        bookService.add(book);
        return CommonResult.success(null);
    }

    @ApiOperation("更新收录书籍信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody UpdateBookParam param) {
        LibraryBook book = new LibraryBook();
        BeanUtils.copyProperties(param, book);
        bookService.updateById(book);
        return CommonResult.success(null);
    }

    @ApiOperation("删除收录书籍信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@RequestParam Long id) {
        bookService.deleteById(id);
        return CommonResult.success(null);
    }
}
