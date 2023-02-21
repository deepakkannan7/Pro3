package com.example.Pro3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pro3Controller {
      @RequestMapping("/My")
      public String getMyFav()
      {
    	  String yourFavColor="Green";
    	  return "My favorite color is "+yourFavColor;
      }
}
