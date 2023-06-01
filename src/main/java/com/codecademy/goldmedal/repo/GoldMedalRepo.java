package com.codecademy.goldmedal.repo;

import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GoldMedalRepo extends CrudRepository<GoldMedal, Integer> {

    List<GoldMedal> getByCountryOrderByYearAsc(String country);
    List<GoldMedal> getByCountryOrderByYearDesc(String country);
}
