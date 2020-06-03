package com.ipc.entities;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRAN_BOM_HEAD")
public class BomHead implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name="BOM_ID", columnDefinition="DECIMAL(19,0) NOT NULL")
	private Long  bomId;
	
	@Column(name="MATERIAL_NO", length = 80)
	private String  materialNo;
	
	@Column(name="BOM_STATUS", length = 1)
	private String  bomStatus;
	
	@Column(name="BOM_VERSION_ERP", length = 30)
	private String  bomVersionErp;
	
	@Column(name="BOM_VALID_FROM")
	private Date  bomValidFrom;
	
	
	@Column(name="PLANT_NO", length = 2)
	private String  plantNo;
	
	@Column(name="CLIENT_NO", length = 20)
	private String  clientNo;
	
	@Column(name="COMPANY_NO", length = 20)
	private String  companyNo;
	
	@Column(name="SOURCE", length = 1)
	private double  source;
	
	@Column(name="STATUS", columnDefinition="DECIMAL(3,0) NOT NULL")
	private double  status;
	
	@Column(name="CREATED")
	private Date created;
	
	@Column(name="STAMP")
	private Date  stamp;
	
	@Column(name="IDOC_ID", columnDefinition="DECIMAL(19,0) NOT NULL")
	private double  idocId;
	
    @Column(name="BAREBOARD_NO", length = 80)
	private String  bareboardNo;
	
	
	public BomHead() {
		super();
	}


	public BomHead(String materialNo, String bomStatus, String bomVersionErp, Date bomValidFrom, String plantNo,
			String clientNo, String companyNo, double source, double status, Date created, Date stamp, double idocId,
			String bareboardNo) {
		super();
		this.materialNo = materialNo;
		this.bomStatus = bomStatus;
		this.bomVersionErp = bomVersionErp;
		this.bomValidFrom = bomValidFrom;
		this.plantNo = plantNo;
		this.clientNo = clientNo;
		this.companyNo = companyNo;
		this.source = source;
		this.status = status;
		this.created = created;
		this.stamp = stamp;
		this.idocId = idocId;
		this.bareboardNo = bareboardNo;
	}


	public String getMaterialNo() {
		return materialNo;
	}


	public void setMaterialNo(String materialNo) {
		this.materialNo = materialNo;
	}


	public String getBomStatus() {
		return bomStatus;
	}


	public void setBomStatus(String bomStatus) {
		this.bomStatus = bomStatus;
	}


	public String getBomVersionErp() {
		return bomVersionErp;
	}


	public void setBomVersionErp(String bomVersionErp) {
		this.bomVersionErp = bomVersionErp;
	}


	public Date getBomValidFrom() {
		return bomValidFrom;
	}


	public void setBomValidFrom(Date bomValidFrom) {
		this.bomValidFrom = bomValidFrom;
	}


	public String getPlantNo() {
		return plantNo;
	}


	public void setPlantNo(String plantNo) {
		this.plantNo = plantNo;
	}


	public String getClientNo() {
		return clientNo;
	}


	public void setClientNo(String clientNo) {
		this.clientNo = clientNo;
	}


	public String getCompanyNo() {
		return companyNo;
	}


	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}


	public double getSource() {
		return source;
	}


	public void setSource(double source) {
		this.source = source;
	}


	public double getStatus() {
		return status;
	}


	public void setStatus(double status) {
		this.status = status;
	}


	public Date getCreated() {
		return created;
	}


	public void setCreated(Date created) {
		this.created = created;
	}


	public Date getStamp() {
		return stamp;
	}


	public void setStamp(Date stamp) {
		this.stamp = stamp;
	}


	public double getIdocId() {
		return idocId;
	}


	public void setIdocId(double idocId) {
		this.idocId = idocId;
	}


	public String getBareboardNo() {
		return bareboardNo;
	}


	public void setBareboardNo(String bareboardNo) {
		this.bareboardNo = bareboardNo;
	}



}
