package com.genie.artemis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 인덱스 컨트롤러
 *
 * Created by geine on 2018. 3. 4..
 */
@Controller
public class IndexController {

  @GetMapping(value = "/index", produces = "text/html")
  public String index() {
    return "index";



    
  }
}
