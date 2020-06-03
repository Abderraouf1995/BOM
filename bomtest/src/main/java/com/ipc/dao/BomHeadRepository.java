package com.ipc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ipc.entities.BomHead;




public interface BomHeadRepository extends JpaRepository<BomHead, Long> {
	

	 @Query(value = "SELECT SEQ_TRANBOMHEAD.nextval FROM dual", nativeQuery = true)
	 public Long getNextSequenceNextValue();
	 @Query(value = "SELECT SEQ_TRANBOMHEAD.currval FROM dual", nativeQuery = true)
	 public Long getNextSequenceCurrValue();
	 

}
