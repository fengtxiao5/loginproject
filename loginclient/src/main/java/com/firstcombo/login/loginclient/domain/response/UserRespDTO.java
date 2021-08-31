package com.firstcombo.login.loginclient.domain.response;

import com.firstcombo.login.loginclient.domain.BaseRespDTO;
import lombok.Data;

/**
 * @ClassName UserRespDTO
 * @Description
 * @Author ftx
 * @Date 2021/8/24 16:37
 * @Version 1.0
 **/
@Data
public class UserRespDTO extends BaseRespDTO {
    private String username;
    private String password;
    private Integer isVip;
}
