import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class a01JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2. 连接数据库
        Connection conn = DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/db", "root", "65431");

        //3.执行sql
        int count = conn.createStatement().executeUpdate("update tb_user set password = 2000 where id = 1");//返回受影响行数
        System.out.println(count);

        //4. 释放资源
        conn.close();
    }
}
