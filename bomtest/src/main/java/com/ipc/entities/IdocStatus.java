package com.ipc.entities;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TRAN_IDOCSTATUS")
public class IdocStatus  implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="IDOCNUM", length = 16)
	private String  idocNum;
	
	@Column(name="DATE_CREATION")
	private Date  dateCreation;
	
	@Column(name="IDOCTYPE", length = 30)
	private String  idocType;
	
	@Column(name="EWSTATUS", columnDefinition="DECIMAL(2,0) NOT NULL")
	private double  ewStatus;
	
	
	@Column(name="ERRORCODE", columnDefinition="DECIMAL(3,0) NOT NULL")
	private double  errorCode;
	
	@Column(name="DATE_IDOC_CREATION")
	private Date  dateIdocCreation;
	
	@Column(name="CONTENT_TYPE", columnDefinition="DECIMAL(2,0) NOT NULL")
	private double  contentType;
	
	@Column(name="SOURCE",columnDefinition="DECIMAL(1,0) NOT NULL")
	private double  source;
	
	@Column(name="REPEAT_COUNTER")
	private Date  companyNo;
	
	@Column(name="STAMP")
	private Timestamp  stamp;
	
	
	public IdocStatus() {
		super();
	}


	public IdocStatus(String idocNum, Date dateCreation, String idocType, double ewStatus, double errorCode,
			Date dateIdocCreation, double contentType, double source, Date companyNo, Timestamp stamp) {
		super();
		this.idocNum = idocNum;
		this.dateCreation = dateCreation;
		this.idocType = idocType;
		this.ewStatus = ewStatus;
		this.errorCode = errorCode;
		this.dateIdocCreation = dateIdocCreation;
		this.contentType = contentType;
		this.source = source;
		this.companyNo = companyNo;
		this.stamp = stamp;
	}


	public String getIdocNum() {
		return idocNum;
	}


	public void setIdocNum(String idocNum) {
		this.idocNum = idocNum;
	}


	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	public String getIdocType() {
		return idocType;
	}


	public void setIdocType(String idocType) {
		this.idocType = idocType;
	}


	public double getEwStatus() {
		return ewStatus;
	}


	public void setEwStatus(double ewStatus) {
		this.ewStatus = ewStatus;
	}


	public double getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(double errorCode) {
		this.errorCode = errorCode;
	}


	public Date getDateIdocCreation() {
		return dateIdocCreation;
	}


	public void setDateIdocCreation(Date dateIdocCreation) {
		this.dateIdocCreation = dateIdocCreation;
	}


	public double getContentType() {
		return contentType;
	}


	public void setContentType(double contentType) {
		this.contentType = contentType;
	}


	public double getSource() {
		return source;
	}


	public void setSource(double source) {
		this.source = source;
	}


	public Date getCompanyNo() {
		return companyNo;
	}


	public void setCompanyNo(Date companyNo) {
		this.companyNo = companyNo;
	}


	public Timestamp getStamp() {
		return stamp;
	}


	public void setStamp(Timestamp stamp) {
		this.stamp = stamp;
	}


	

}
