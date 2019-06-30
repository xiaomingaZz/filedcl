package com.tm.filedcl.domain.service;

import com.tm.filedcl.domain.entity.ZipFileDcl;
import com.baomidou.mybatisplus.service.IService;
import com.tm.filedcl.domain.mapper.ZipFileDclMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tm
 * @since 2019-06-28
 */
public interface ZipFileDclService extends IService<ZipFileDcl> {
    ZipFileDcl getZipFileDclById(@Param("id")String id);

    String select1(@Param("id")String id);
}
