package com.vinisitaly.webpage.dao;

import com.vinisitaly.webpage.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
