package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
    private static final SqlSessionFactory factory;

    static {
        try {
            factory = new SqlSessionFactoryBuilder().build(
                    Resources.getResourceAsStream("mybatis-config.xml")
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static SqlSession getSession() {
        return factory.openSession(); // 默认手动提交
    }
}
