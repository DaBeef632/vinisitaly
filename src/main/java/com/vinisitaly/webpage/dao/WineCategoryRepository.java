package com.vinisitaly.webpage.dao;

import com.vinisitaly.webpage.entity.WineCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "wineCategory", path = "wine-category")
public interface WineCategoryRepository extends JpaRepository<WineCategory, Long> {
}
