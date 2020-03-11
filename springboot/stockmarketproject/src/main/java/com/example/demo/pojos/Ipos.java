package com.example.demo.pojos;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ipos")
public class Ipos {

	@Id
	private int id;
	private String companyName;
	private String stockExchange;
	private Float pricePerShare;
	private int totalNoOfShare;
	 Date openDateTime=new Date();
	private String remarks;

	@Override
	public String toString() {
		return "Ipos [id=" + id + ", companyName=" + companyName + ", stockExchange=" + stockExchange
				+ ", pricePerShare=" + pricePerShare + ", totalNoOfShare=" + totalNoOfShare + ", openDateTime="
				+ openDateTime + ", remarks=" + remarks + "]";
	}
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public Float getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(Float pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public int getTotalNoOfShare() {
		return totalNoOfShare;
	}
	public void setTotalNoOfShare(int totalNoOfShare) {
		this.totalNoOfShare = totalNoOfShare;
	}
	public Date getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(Date openDateTime) {
		this.openDateTime = openDateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
