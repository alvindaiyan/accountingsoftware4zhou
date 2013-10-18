package com.accsoftware.common;

import java.util.Date;

public class Table1 implements java.io.Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1329814018192038101L;
	private Integer table1_Id;
	private Date date;
	private String item;
	private Double fee;
	private Double gst;
	private Double vehicle;
	private Double wages;
	private Double stationary;
	
	public Table1(){}

	public Integer getTable1_Id() {
		return table1_Id;
	}

	public void setTable1_Id(Integer table1_Id) {
		this.table1_Id = table1_Id;
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

	public Double getVehicle() {
		return vehicle;
	}

	public void setVehicle(Double vehicle) {
		this.vehicle = vehicle;
	}

	public Double getWages() {
		return wages;
	}

	public void setWages(Double wages) {
		this.wages = wages;
	}

	public Double getStationary() {
		return stationary;
	}

	public void setStationary(Double stationary) {
		this.stationary = stationary;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
