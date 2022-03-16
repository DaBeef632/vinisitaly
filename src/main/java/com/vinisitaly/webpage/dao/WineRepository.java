package com.vinisitaly.webpage.dao;

import com.vinisitaly.webpage.entity.Wine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WineRepository extends JpaRepository<Wine, Long> {
}
