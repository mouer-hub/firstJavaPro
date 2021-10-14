package javaPackage1;

import java.sql.Connection;
import java.sql.DriverManager;

public class LinkDatabase {
    public static Connection getConn() {
        // TODO Auto-generated method stub
        String driverName="com.mysql.jdbc.Driver";
        //String driverName="org.git.mm.mysql.Driver";
        String dbURL="jdbc:mysql://localhost:3306/courseadmin";
        String userName="root";
        String userPwd="mou19990614";
        Connection conn=null;
        try {
            Class.forName(driverName);
            conn= DriverManager.getConnection(dbURL,userName,userPwd);
            System.out.println("数据库连接成功");
        }catch(Exception e) {
            System.out.println("数据库连接失败");
        }
        return conn;
    }
}
