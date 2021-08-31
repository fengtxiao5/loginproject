package com.firstcombo.login.loginserver.infrastructure.repo.mapper;

import com.firstcombo.login.loginserver.infrastructure.repo.dbdo.UserDO;

public interface UserDOMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    UserDO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);
}