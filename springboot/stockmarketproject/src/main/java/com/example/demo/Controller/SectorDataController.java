package com.example.demo.Controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.SectorDataRepository;
import com.example.demo.dao.StockPriceRepository;
import com.example.demo.pojos.SectorData;
import com.example.demo.pojos.StockPrice;
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/sector")
@RestController
public class SectorDataController {


	@Autowired
	private SectorDataRepository sectorDataRepository;
	@RequestMapping("/getAllsector")
	public Iterable<SectorData>getAllUser()
	{
		return sectorDataRepository.findAll();
	}
	@PostMapping("/saveSector")
	public SectorData saveStock(@RequestBody SectorData stock)
	{
		System.out.println(stock);
	sectorDataRepository.save(stock);
		return stock;
	}
	@PutMapping("/putsector/{id}")
	public SectorData updateStock(@RequestBody SectorData stock,@PathVariable("id") Integer id)
	{
		
		stock.setId(id);
		System.out.println(stock);
		
		sectorDataRepository.save(stock);
		return stock;
	}
	@DeleteMapping("/deletesector/{id}")
	public boolean deleteStock(@PathVariable("id") Integer id)
	{
		
	
		System.out.println(id);
		
		sectorDataRepository.deleteById(id);;
		return true;
	}
	@GetMapping("/findsector/{id}")
	public SectorData findAllinOne(@PathVariable("id")  Integer id)
	{
	
	Optional<SectorData> stock=sectorDataRepository.findById(id);
		return stock.get();
	}
}
