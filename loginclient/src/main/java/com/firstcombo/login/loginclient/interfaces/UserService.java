package com.firstcombo.login.loginclient.interfaces;

import com.firstcombo.login.loginclient.domain.Result;
import com.firstcombo.login.loginclient.domain.request.UserReqDTO;
import com.firstcombo.login.loginclient.domain.response.UserRespDTO;

/**
 * @ClassName UserService
 * @Description
 * @Author ftx
 * @Date 2021/8/24 16:28
 * @Version 1.0
 **/
public interface UserService {
    /**
     * 测试功能
     * @param reqDTO
     * @return
     */
    public Result<UserRespDTO> show(UserReqDTO reqDTO);
}
