package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class main1 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/face?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=UTC";
        String driver = "com.mysql.jdbc.Driver";
        try{
            Class.forName(driver);
        }catch(Exception e){
            System.out.println("无法加载驱动");
        }

        try {
            Connection con = DriverManager.getConnection(url,"root","9538");
            if(!con.isClosed())
                System.out.println("success");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
