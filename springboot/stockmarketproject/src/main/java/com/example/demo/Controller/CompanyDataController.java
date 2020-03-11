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

import com.example.demo.dao.CompanyDataRepository;

import com.example.demo.pojos.CompanyData;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/company")
public class CompanyDataController {

	
	@Autowired
	private CompanyDataRepository companyDataRepository;
	@RequestMapping("/getAllcompanydata")
	public Iterable<CompanyData>getAllUser()
	{
		return companyDataRepository.findAll();
	}
	@PostMapping("/savecompanydata")
	public CompanyData saveStock(@RequestBody CompanyData stock)
	{
		System.out.println(stock);
	companyDataRepository.save(stock);
		return stock;
	}
	@PutMapping("/putcompanydata/{stockCode}")
	public CompanyData updateStock(@RequestBody CompanyData stock,@PathVariable("stockCode") String stockcode)
	{
		
		stock.setStockCode(stockcode);
		System.out.println(stock);
		
		companyDataRepository.save(stock);
		return stock;
	}
	@DeleteMapping("/deletecompanycode/{stockCode}")
	public boolean deleteStock(@PathVariable("stockCode") String stockcode)
	{
		
	
		System.out.println(stockcode);
		
		companyDataRepository.deleteById(stockcode);;
		return true;
	}
	@GetMapping("/findcompanycode/{stockCode}")
	public CompanyData findAllinOne(@PathVariable("stockCode")  String stockcode)
	{
	
	Optional<CompanyData> stock=companyDataRepository.findById(stockcode);
		return stock.get();
	}
}
