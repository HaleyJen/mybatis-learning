import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pojo.User;
import utils.MyBatisUtil;

import java.io.IOException;
import java.util.List;

public class DaoTest {
    SqlSession sqlSession;
    UserMapper mapper;

    @Before
    public void openSession() {
        sqlSession = MyBatisUtil.getSession(); // 可改为 true 表示自动提交
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    // 每个测试方法后执行，关闭 session
    @After
    public void closeSession() {
        sqlSession.close();
    }


    @Test
    public void testSelectAll() throws IOException {
        List<User> users = mapper.selectAll();
        System.out.println(users);
    }

    @Test
    public void testSelectById(){
        User user = mapper.selectById(2);
        System.out.println(user);

    }
}
