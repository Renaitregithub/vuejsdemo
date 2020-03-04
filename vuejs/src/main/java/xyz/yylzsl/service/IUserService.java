package xyz.yylzsl.service;

import xyz.yylzsl.pojo.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    User findById(Integer id);

    void update(User user);

    void save(User user);

    void delete(Integer id);
}
