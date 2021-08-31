import com.firstcombo.login.loginclient.domain.Result;
import com.firstcombo.login.loginclient.domain.request.UserReqDTO;
import com.firstcombo.login.loginclient.domain.response.UserRespDTO;
import com.firstcombo.login.loginclient.interfaces.UserService;
import com.firstcombo.login.loginserver.LoginServerApplicationStarter;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName UserTest
 * @Description
 * @Author ftx
 * @Date 2021/8/25 14:06
 * @Version 1.0
 **/
@SpringBootTest(classes = LoginServerApplicationStarter.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void show(){
        UserReqDTO reqDTO = new UserReqDTO();
        reqDTO.setId("1");
        reqDTO.setUsername("sds");
        Result<UserRespDTO> show = userService.show(reqDTO);
        System.out.println(show);
    }

}
