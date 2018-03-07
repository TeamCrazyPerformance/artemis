package com.genie.artemis.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
  public String loginCheck(String email, String password) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
    Connection c = DriverManager.getConnection("jdbc:mysql://localhost/test", "study", "study");
    PreparedStatement ps = c.prepareStatement("select * from users where email = ?");
    ps.setString(1, email);

    ResultSet rs = ps.executeQuery();
    rs.next();

    if (!email.equals(rs.getString("email"))) {
      System.out.println("email is not valid");
      return null;
    }
    else if (!password.equals(rs.getString("password"))) {
      System.out.println("password is not valid");
      return null;
    }
    else {
      System.out.println("login success");
      return email;
    }
  }
}
