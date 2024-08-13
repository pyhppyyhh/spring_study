package com.example.demo2.lotto.controller;



import com.example.demo2.lotto.LottoGetApi;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;

@RestController
public class HelloController {



    @GetMapping("/hello")
    public String testController(Model model) throws MalformedURLException {
        StringBuffer aa = LottoGetApi.getNumber();
        return aa.toString();
    }
}
