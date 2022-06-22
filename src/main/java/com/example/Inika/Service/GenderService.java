package com.example.Inika.Service;
import com.example.Inika.Repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Inika.model.Gender;

import java.util.ArrayList;
import java.util.List;

@Service
public class GenderService {
    @Autowired
    private GenderRepository genderrepository;

    public List<Gender> getGender(){
        List<Gender>gender = new ArrayList<>();
        genderrepository.findAll().forEach(gender::add);
        return gender;
    }
}
