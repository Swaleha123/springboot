package com.example.demo.stockprice.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stockexchange")
public class StockExchange {

			
			private Integer id;
			@Id
			private String stockExchange;
			private String brief;
			private String contactAddress;
			private String remarks;
			public String getStockExchange() {
				return stockExchange;
			}


			public void setStockExchange(String stockExchange) {
				this.stockExchange = stockExchange;
			}
			
			@Override
			public String toString() {
				return "stockEx [id=" + id + ", stockEx=" + stockExchange + ", brief=" + brief
						+ ", contactAddress=" + contactAddress + ", remarks=" + remarks + "]";
			}
			

			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			
			public String getBrief() {
				return brief;
			}
			public void setBrief(String brief) {
				this.brief = brief;
			}
			public String getContactAddress() {
				return contactAddress;
			}
			public void setContactAddress(String contactAddress) {
				this.contactAddress = contactAddress;
			}
			public String getRemarks() {
				return remarks;
			}
			public void setRemarks(String remarks) {
				this.remarks = remarks;
			}
			}
