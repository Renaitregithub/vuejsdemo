package xyz.yylzsl.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.yylzsl.pojo.User;
import xyz.yylzsl.service.IUserService;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/findById")
    public User findById(Integer id){
        return userService.findById(id);
    }

    @RequestMapping("/update")
    public void updateUser(@RequestBody User user){
        System.out.println(user.getUsername());
        userService.update(user);
    }

    @RequestMapping("/save")
    public void saveUser(@RequestBody User user){
        System.out.println(user.getUsername());
        userService.save(user);
    }

    @RequestMapping("/delete")
    public void delete(Integer id){
        userService.delete(id);
    }
}
