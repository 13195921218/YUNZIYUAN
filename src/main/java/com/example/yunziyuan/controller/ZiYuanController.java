package com.example.yunziyuan.controller;

import com.example.yunziyuan.service.ZiYuanService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
@Controller
public class ZiYuanController {

    @Autowired
    ZiYuanService ziyuanService;

    @RequestMapping(value = "/getJoke",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String jokeApi() throws Exception {
        //return "getjoke";
        ziyuanService.httpRequest();
        return "saved";
    }
}

