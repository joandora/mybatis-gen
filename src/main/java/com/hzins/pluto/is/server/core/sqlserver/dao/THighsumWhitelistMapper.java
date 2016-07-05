package com.hzins.pluto.is.server.core.sqlserver.dao;

import com.hzins.pluto.is.server.core.sqlserver.entity.THighsumWhitelist;

public interface THighsumWhitelistMapper {
    int deleteByPrimaryKey(Long id);

    int insert(THighsumWhitelist record);

    int insertSelective(THighsumWhitelist record);

    THighsumWhitelist selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(THighsumWhitelist record);

    int updateByPrimaryKey(THighsumWhitelist record);
}