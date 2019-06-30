package com.tm.filedcl.domain.controller;


import com.tm.filedcl.domain.entity.ZipFileDcl;
import com.tm.filedcl.domain.mapper.ZipFileDclMapper;
import com.tm.filedcl.domain.service.ZipFileDclService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private ZipFileDclService zipFileDclService;

    @RequestMapping("test.do")
    public String test() {
        return "success1";
    }

    @RequestMapping("getZipFileDclById.do")
    public ZipFileDcl getZipFileDclById(String id) {
        return zipFileDclService.getZipFileDclById(id);
    }

    @RequestMapping("select1.do")
    public String select1(String id) {
        return zipFileDclService.select1(id);
    }


}
