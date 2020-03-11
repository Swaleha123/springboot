package com.example.demo.company.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="companydata")
public class CompanyData {
	
	@Id
	private String stockCode;
			private String companyName;
			private float turnOver;
			private String ceo;
			private String boardOfDirectories;
			private String listOfStockExchange;
			private String sector;
			private String brief;
			
			@Override
			public String toString() {
				return "CompanyData [companyName=" + companyName + ", turnOver=" + turnOver + ", ceo=" + ceo
						+ ", boardOfDirectories=" + boardOfDirectories + ", listOfStockExchange=" + listOfStockExchange
						+ ", sector=" + sector + ", brief=" + brief + ", stockCode=" + stockCode + "]";
			}
			
			public String getCompanyName() {
				return companyName;
			}
			public void setCompanyName(String companyName) {
				this.companyName = companyName;
			}
			public float getTurnOver() {
				return turnOver;
			}
			public void setTurnOver(float turnOver) {
				this.turnOver = turnOver;
			}
			public String getCeo() {
				return ceo;
			}
			public void setCeo(String ceo) {
				this.ceo = ceo;
			}
			public String getBoardOfDirectories() {
				return boardOfDirectories;
			}
			public void setBoardOfDirectories(String boardOfDirectories) {
				this.boardOfDirectories = boardOfDirectories;
			}
			public String getListOfStockExchange() {
				return listOfStockExchange;
			}
			public void setListOfStockExchange(String listOfStockExchange) {
				this.listOfStockExchange = listOfStockExchange;
			}
			public String getSector() {
				return sector;
			}
			public void setSector(String sector) {
				this.sector = sector;
			}
			public String getBrief() {
				return brief;
			}
			public void setBrief(String brief) {
				this.brief = brief;
			}
			public String getStockCode() {
				return stockCode;
			}
			public void setStockCode(String stockCode) {
				this.stockCode = stockCode;
			}
			
}
