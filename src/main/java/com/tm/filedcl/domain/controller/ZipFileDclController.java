package com.tm.filedcl.domain.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tm
 * @since 2019-06-28
 */
@RestController
@RequestMapping("/zipFileDcl/")
public class ZipFileDclController {

    @RequestMapping("test.do")
    public String test() {
        return "success1";
    }
}
