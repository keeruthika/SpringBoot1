package com.example.Inika.controller;

import com.example.Inika.Service.GenderService;
import com.example.Inika.model.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GenderController {
    @Autowired
    private GenderService genderService;

    @RequestMapping("/getGenderInfo")
    public List<Gender> getGender()
    {
        return genderService.getGender();
    }
}
