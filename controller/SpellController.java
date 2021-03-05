package com.fetchdata.controller;

import com.fetchdata.model.Class;
import com.fetchdata.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class SpellController {

    @Autowired
    IClassService service;

    @GetMapping("/getclass")
    public String classdb(Model model){
        List<Class> list = service.fetchAll();

        model.addAttribute("class", list);

        return "home/index";
    }

}
