package com.vinisitaly.webpage.dao;


import com.vinisitaly.webpage.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
