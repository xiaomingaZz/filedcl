package com.tm.filedcl.domain.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tm.filedcl.domain.entity.ZipFileDcl;
import com.tm.filedcl.domain.mapper.ZipFileDclMapper;
import com.tm.filedcl.domain.service.ZipFileDclService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tm
 * @since 2019-06-28
 */
@Service
public class ZipFileDclServiceImpl extends ServiceImpl<ZipFileDclMapper, ZipFileDcl> implements ZipFileDclService {
    @Autowired
    private ZipFileDclMapper zipFileDclMapper;


    @Override
    public ZipFileDcl getZipFileDclById(String id) {
        return zipFileDclMapper.getZipFileDclById(id);
    }

    @Override
    public String select1(String id) {
        return zipFileDclMapper.select1(id);
    }
}
