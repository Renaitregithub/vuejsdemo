package xyz.yylzsl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.yylzsl.mapper.IUserMapper;
import xyz.yylzsl.pojo.User;
import xyz.yylzsl.service.IUserService;

import java.util.List;

@Service
public class UserServiceimpl implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }

    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }
}
