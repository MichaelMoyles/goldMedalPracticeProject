package com.codecademy.goldmedal.repo;

import com.codecademy.goldmedal.model.Country;
import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

import java.util.List;

public interface CountryRepo extends CrudRepository<Country, Integer> {
    Optional<Country> getByName(String name);
    List<Country> getAllByOrderByNameAsc();
    List<Country> getAllByOrderByNameDesc();
    List<Country> getAllByOrderByGdpAsc();
    List<Country> getAllByOrderByGdpDesc();
    List<Country> getAllByOrderByPopulationAsc();
    List<Country> getAllByOrderByPopulationDesc();


}
