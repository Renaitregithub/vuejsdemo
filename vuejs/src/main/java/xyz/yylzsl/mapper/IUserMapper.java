package xyz.yylzsl.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import xyz.yylzsl.pojo.User;

import java.util.List;

public interface IUserMapper {

    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where id = #{id}")
    User findById(Integer id);

    @Update("update user set username=#{username},password=#{password},sex=#{sex},age=#{age},email=#{email} where id = #{id}")
    void update(User user);

    @Insert("insert into user(username,password,sex,age,email) values(#{username},#{password},#{sex},#{age},#{email})")
    void save(User user);

    @Delete("delete from user where id = #{id}")
    void delete(Integer id);
}
