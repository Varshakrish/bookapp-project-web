package com.varsha.revature;

import java.sql.Connection;

public class TestConnectionUtil {

   public static void main(String[] args) throws Exception {
        
       Connection con = ConnectionUtil.getConnection();
       System.out.println("Connection:" + con);

   }

}
