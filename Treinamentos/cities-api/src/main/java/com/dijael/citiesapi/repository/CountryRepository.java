package com.dijael.citiesapi.repository;

import com.dijael.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CountryRepository extends JpaRepository<Country, Long> {

}
