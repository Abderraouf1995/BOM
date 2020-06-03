package com.ipc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ipc.entities.IdocStatus;


public interface IdocStatusRepository extends JpaRepository<IdocStatus, Long> {

	 @Query(value = "SELECT SEQ_TRANIDOCSTATUS.nextval FROM dual", nativeQuery = true)
	 public Long getNextSequenceNextValue();
	 @Query(value = "SELECT SEQ_TRANIDOCSTATUS.currval FROM dual", nativeQuery = true)
	 public Long getNextSequenceCurrValue();
	
}
