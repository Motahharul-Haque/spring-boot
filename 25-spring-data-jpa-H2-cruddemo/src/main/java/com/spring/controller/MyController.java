package com.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.ICityService;

@Controller
public class MyController {

    @Autowired
    private ICityService cityService;

    @RequestMapping("/")
    public String index(Model model) {

        return "index";
    }

    @RequestMapping("/cities")
    public ModelAndView showCities() {

        var cities = cityService.findAll();

        Map<String, Object> params = new HashMap<>();
        params.put("cities", cities);

        return new ModelAndView("showCities", params);
    }
}