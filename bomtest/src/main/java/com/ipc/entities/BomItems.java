package com.ipc.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TRAN_BOM_ITEM")
public class BomItems implements Serializable {
	@Id
	@GeneratedValue
	@Column(name="BOM_ID", columnDefinition="DECIMAL(19,0) NOT NULL")
	private int  bomId;
	
	@Column(name="COMPONENT_NO", length = 80)
	private String  componentNo;
	
	@Column(name="POS_TYPE",  columnDefinition="DECIMAL(10,0) NOT NULL")
	private int  posType;
	
	@Column(name="ALTERNATIVE", length = 1)
	private String  alternative;
	
	@Column(name="ALTERNATIVE_PROPABILITY", length = 5)
	private String  alternativeProbability;
	
	@Column(name="PROCESS_GROUP", length = 20)
	private String  processGroup;
	
	@Column(name="POS_VALID_FROM")
	private Date  pos_validFrom;
	
	@Column(name="ERP_POS_NO", length = 10)
	private String  erpPosNo;
	
	@Column(name="LAYER", length = 1)
	private String  layer;
	
	@Column(name="QTY", columnDefinition="DECIMAL(16,4) NOT NULL")
	private int qty;
	
	@Column(name="UNIT", length = 16)
	private String  unit;
	
	@Column(name="SETUP_FLAG", length = 16)
	private String  setupFlag;
	
	@Column(name="STATUS", length = 3)
	private int  status;
	
	@Column(name="STAMP")
	private Date  stamp;
	
	@Column(name="COMPANY_NO_EXT", length = 20)
	private String  companyNoExt;


	
	
	public BomItems() {
		super();
	}




	public BomItems(String componentNo, int posType, String alternative, String alternativeProbability,
			String processGroup, Date pos_validFrom, String erpPosNo, String layer, int qty, String unit,
			String setupFlag, int status, Date stamp, String companyNoExt) {
		super();
		this.componentNo = componentNo;
		this.posType = posType;
		this.alternative = alternative;
		this.alternativeProbability = alternativeProbability;
		this.processGroup = processGroup;
		this.pos_validFrom = pos_validFrom;
		this.erpPosNo = erpPosNo;
		this.layer = layer;
		this.qty = qty;
		this.unit = unit;
		this.setupFlag = setupFlag;
		this.status = status;
		this.stamp = stamp;
		this.companyNoExt = companyNoExt;
	}




	public String getComponentNo() {
		return componentNo;
	}




	public void setComponentNo(String componentNo) {
		this.componentNo = componentNo;
	}




	public int getPosType() {
		return posType;
	}




	public void setPosType(int posType) {
		this.posType = posType;
	}




	public String getAlternative() {
		return alternative;
	}




	public void setAlternative(String alternative) {
		this.alternative = alternative;
	}




	public String getAlternativeProbability() {
		return alternativeProbability;
	}




	public void setAlternativeProbability(String alternativeProbability) {
		this.alternativeProbability = alternativeProbability;
	}




	public String getProcessGroup() {
		return processGroup;
	}




	public void setProcessGroup(String processGroup) {
		this.processGroup = processGroup;
	}




	public Date getPos_validFrom() {
		return pos_validFrom;
	}




	public void setPos_validFrom(Date pos_validFrom) {
		this.pos_validFrom = pos_validFrom;
	}




	public String getErpPosNo() {
		return erpPosNo;
	}




	public void setErpPosNo(String erpPosNo) {
		this.erpPosNo = erpPosNo;
	}




	public String getLayer() {
		return layer;
	}




	public void setLayer(String layer) {
		this.layer = layer;
	}




	public int getQty() {
		return qty;
	}




	public void setQty(int qty) {
		this.qty = qty;
	}




	public String getUnit() {
		return unit;
	}




	public void setUnit(String unit) {
		this.unit = unit;
	}




	public String getSetupFlag() {
		return setupFlag;
	}




	public void setSetupFlag(String setupFlag) {
		this.setupFlag = setupFlag;
	}




	public int getStatus() {
		return status;
	}




	public void setStatus(int status) {
		this.status = status;
	}




	public Date getStamp() {
		return stamp;
	}




	public void setStamp(Date stamp) {
		this.stamp = stamp;
	}




	public String getCompanyNoExt() {
		return companyNoExt;
	}




	public void setCompanyNoExt(String companyNoExt) {
		this.companyNoExt = companyNoExt;
	}




	

}
