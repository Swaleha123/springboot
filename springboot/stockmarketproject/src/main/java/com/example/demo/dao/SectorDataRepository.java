package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojos.SectorData;
import com.example.demo.pojos.StockPrice;

public interface SectorDataRepository extends CrudRepository<SectorData,Integer> {

}
