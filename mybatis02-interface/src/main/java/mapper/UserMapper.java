package mapper;

import org.apache.ibatis.annotations.Select;
import pojo.User;

import java.util.List;

public interface UserMapper {
     //注解开发
     List<User> selectAll();

     //配置文件开发
     @Select("select * from tb_User where id = #{id}")
     User selectById(int id);

}
