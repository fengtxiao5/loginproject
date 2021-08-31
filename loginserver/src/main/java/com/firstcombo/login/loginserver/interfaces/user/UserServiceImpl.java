package com.firstcombo.login.loginserver.interfaces.user;

import com.firstcombo.login.loginclient.domain.Result;
import com.firstcombo.login.loginclient.domain.request.UserReqDTO;
import com.firstcombo.login.loginclient.domain.response.UserRespDTO;
import com.firstcombo.login.loginclient.interfaces.UserService;
import com.firstcombo.login.loginserver.infrastructure.repo.dbdo.UserDO;
import com.firstcombo.login.loginserver.infrastructure.repo.mapper.UserDOMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalLookupService;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author ftx
 * @Date 2021/8/24 16:52
 * @Version 1.0
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDOMapper userDOMapper;

    @Override
    public Result<UserRespDTO> show(UserReqDTO reqDTO) {
        String id = reqDTO.getId();
        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
        Result<UserRespDTO> result = new Result<>();
        UserRespDTO respDTO = new UserRespDTO();
        BeanUtils.copyProperties(userDO,respDTO);
        result.setModule(respDTO);
        return result;
    }
}
