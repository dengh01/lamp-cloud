package com.github.zuihou.file.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.zuihou.file.entity.File;

import org.springframework.stereotype.Repository;

/**
 * <p>
 * Mapper 接口
 * 文件表
 * </p>
 *
 * @author zuihou
 * @date 2019-06-24
 */
@Repository
public interface FileMapper extends BaseMapper<File> {

}