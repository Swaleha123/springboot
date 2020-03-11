package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojos.StockPrice;


public interface StockPriceRepository extends CrudRepository<StockPrice,String>  {

}
