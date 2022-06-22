package com.example.Inika.Repository;

import com.example.Inika.model.Gender;
import org.springframework.data.repository.CrudRepository;

public interface GenderRepository extends CrudRepository<Gender, String> {
}
