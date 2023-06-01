package com.codecademy.goldmedal.repo;

import com.codecademy.goldmedal.model.GoldMedal;
import com.codecademy.goldmedal.model.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GoldMedalRepo extends CrudRepository<GoldMedal, Integer> {

    List<GoldMedal> getByCountryOrderByYearAsc(String country);
    List<GoldMedal> getByCountryOrderByYearDesc(String country);
    List<GoldMedal> getByCountryOrderBySeasonAsc(String country);
    List<GoldMedal> getByCountryOrderBySeasonDesc(String country);
    List<GoldMedal> getByCountryOrderByCityAsc(String country);
    List<GoldMedal> getByCountryOrderByCityDesc(String country);
    List<GoldMedal> getByCountryOrderByNameAsc(String country);
    List<GoldMedal> getByCountryOrderByNameDesc(String country);
    List<GoldMedal> getByCountryOrderByEventDesc(String country);
    List<GoldMedal> getByCountryOrderByEventAsc(String country);
    int countByCountry(String country);
    List<GoldMedal> getByCountryAndSeasonOrderByYearAsc(String country, String season);
    int countBySeason(String season);
    int countByGender(String gender);
}
