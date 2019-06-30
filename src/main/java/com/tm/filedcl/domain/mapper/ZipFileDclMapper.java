package com.tm.filedcl.domain.mapper;

import com.tm.filedcl.domain.entity.ZipFileDcl;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author tm
 * @since 2019-06-28
 */
public interface ZipFileDclMapper extends BaseMapper<ZipFileDcl> {
    ZipFileDcl getZipFileDclById(@Param("id")String id);
    String select1(@Param("id")String id);
}