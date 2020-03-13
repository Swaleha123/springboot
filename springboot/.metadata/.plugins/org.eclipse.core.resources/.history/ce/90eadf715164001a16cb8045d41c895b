package com.example.demo.stockprice.pojos;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="stockprice")
public class StockPrice {
			
			private String companyCode;
			@Id
			private String stockExchange;
			private float currentPrice;
		 Date date=new Date();
		 @Transient
		 List<StockExchange>StockExchangeList;

			public List<StockExchange> getStockExchangeList() {
			return StockExchangeList;
		}
		public void setStockExchangeList(List<StockExchange> stockExchangeList) {
			StockExchangeList = stockExchangeList;
		}
			@Override
			public String toString() {
				return "StockPrice [companyCode=" + companyCode + ", stockExchange=" + stockExchange + ", currentPrice="
						+ currentPrice + ", date=" + date + "]";
			}
						public String getCompanyCode() {
				return companyCode;
			}
			public void setCompanyCode(String companyCode) {
				this.companyCode = companyCode;
			}
			public String getStockExchange() {
				return stockExchange;
			}
			public void setStockExchange(String stockExchange) {
				this.stockExchange = stockExchange;
			}
			public float getCurrentPrice() {
				return currentPrice;
			}
			public void setCurrentPrice(float currentPrice) {
				this.currentPrice = currentPrice;
			}
			public Date getDate() {
				return date;
			}
			public void setDate(Date date) {
				this.date = date;
			}
			
			

		
			
}
