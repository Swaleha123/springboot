package com.example.demo.stockprice.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.stockprice.pojos.StockExchange;




public interface StockExchangeRepository extends CrudRepository<StockExchange,String> {

	Optional<StockExchange> findById(String stockExchange);
	List<StockExchange> findByStockExchange(String stockExchange);
}
