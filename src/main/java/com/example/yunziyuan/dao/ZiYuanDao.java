package com.example.yunziyuan.dao;

import com.example.yunziyuan.domain.ZiYuan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Repository
public class ZiYuanDao {

    @Autowired(required = false)
    public JdbcTemplate jdbcTemplate;

    public Connection getConn() {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://172.23.62.176:3306/ziyuan?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        String username = "root";
        String password = "123456";
        Connection conn = null;

        try {
            Class.forName(driver); //
            conn = (Connection) DriverManager.getConnection(url, username, password);

            System.out.println("数据库连接成功");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

}

