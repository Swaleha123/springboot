package com.example.demo.stockprice.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.stockprice.pojos.StockPrice;




public interface StockPriceRepository extends CrudRepository<StockPrice,String>  {

}
