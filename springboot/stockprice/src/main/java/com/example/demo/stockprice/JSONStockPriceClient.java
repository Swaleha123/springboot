package com.example.demo.stockprice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.stockprice.pojos.StockExchange;



@FeignClient(value = "jstockprice", url = "http://localhost:8892/stockExchange/")

public interface JSONStockPriceClient {

	@GetMapping("/findByStockExchange/{stockExchange}")

	public List<StockExchange> findByStockExchange(@PathVariable("stockExchange") String stockExchange);

}