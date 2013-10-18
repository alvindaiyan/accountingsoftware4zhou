package com.accsoftware.common;

import java.util.Date;

import com.accsoftware.util.DataHandler;

public class Table2 implements java.io.Serializable  {

	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8637771854398358430L;

	private Integer table2_Id;
	private Date date;
	private String item;
	private Double fee;
	private Double gst;
	private Double accomodation;
	private Double transport;
	private Double admissions;
	private Double parking;
	private Double dining;
	private Double wages;
	
	public Table2(){}
	
	
	
	public Integer getTable2_Id() {
		return table2_Id;
	}



	public void setTable2_Id(Integer table2_Id) {
		this.table2_Id = table2_Id;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public String getItem() {
		return item;
	}



	public void setItem(String item) {
		this.item = item;
	}



	public Double getFee() {
		return fee;
	}



	public void setFee(Double fee) {
		this.fee = fee;
	}



	public Double getGst() {
		return gst;
	}



	public void setGst(Double gst) {
		this.gst = gst;
	}



	public Double getAccomodation() {
		return accomodation;
	}



	public void setAccomodation(Double accomodation) {
		this.accomodation = accomodation;
	}



	public Double getTransport() {
		return transport;
	}



	public void setTransport(Double transport) {
		this.transport = transport;
	}



	public Double getAdmissions() {
		return admissions;
	}



	public void setAdmissions(Double admissions) {
		this.admissions = admissions;
	}



	public Double getParking() {
		return parking;
	}



	public void setParking(Double parking) {
		this.parking = parking;
	}



	public Double getDining() {
		return dining;
	}



	public void setDining(Double dining) {
		this.dining = dining;
	}



	public Double getWages() {
		return wages;
	}



	public void setWages(Double wages) {
		this.wages = wages;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	
}
