package xyz.yylzsl.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.yylzsl.pojo.User;
import xyz.yylzsl.service.IUserService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserMapperTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testFindAll(){
        List<User> list = userService.findAll();
        System.out.println(list);
    }

    @Test
    public void testFindOne(){
        User user = userService.findById("f55b7d3a352a4f0782c910b2c70f1ea4");
        System.out.println(user);
    }

    @Test
    public void testUpdate(){
        User user = userService.findById("f55b7d3a352a4f0782c910b2c70f1ea4");
        System.out.println("修改之前的用户："+user);
        user.setTelephone("110");
        userService.update(user);
        user = userService.findById("f55b7d3a352a4f0782c910b2c70f1ea4");
        System.out.println("修改之后的用户："+user);

    }
}
