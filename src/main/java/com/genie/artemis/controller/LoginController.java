package com.genie.artemis.controller;

import org.springframework.stereotype.Controller;
import java.sql.SQLException;

import com.genie.artemis.repository.UserDao;

@Controller
public class LoginController {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {

    UserDao dao = new UserDao();
    dao.loginCheck("a@a.com", "11");
  }
}
