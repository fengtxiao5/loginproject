package com.firstcombo.login.loginclient.domain.request;

import com.firstcombo.login.loginclient.domain.BaseReqDTO;
import lombok.Data;

/**
 * @ClassName UserReqDTO
 * @Description
 * @Author ftx
 * @Date 2021/8/24 15:21
 * @Version 1.0
 **/
@Data
public class UserReqDTO extends BaseReqDTO {
    private String username;
    private String password;
    private Integer isVip;
}
