package com.ipc.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ipc.entities.BomItems;


public interface BomItemsRepository extends JpaRepository<BomItems, Long> {

}
