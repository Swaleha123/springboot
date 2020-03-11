package com.example.demo.ipos.Controller;

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

import com.example.demo.ipos.dao.IposRepository;
import com.example.demo.ipos.pojos.Ipos;


@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping("/ipos")
public class IposController {


	@Autowired
	private IposRepository iposrepository;
	@RequestMapping("/getAllipos")
	public Iterable<Ipos>getAllUser()
	{
		return iposrepository.findAll();
	}
	@PostMapping("/saveipos")
	public Ipos saveStock(@RequestBody Ipos stock)
	{
		System.out.println(stock);
	iposrepository.save(stock);
		return stock;
	}
	@PutMapping("/putipos/{id}")
	public Ipos updateStock(@RequestBody Ipos stock,@PathVariable("id") Integer id)
	{
		
		stock.setId(id);
		System.out.println(stock);
		
		iposrepository.save(stock);
		return stock;
	}
	@DeleteMapping("/deleteipos/{id}")
	public boolean deleteStock(@PathVariable("id") Integer id)
	{
		
	
		System.out.println(id);
		
		iposrepository.deleteById(id);;
		return true;
	}
	@GetMapping("/findipos/{id}")
	public Ipos findAllinOne(@PathVariable("id")  Integer id)
	{
	
	Optional<Ipos> stock=iposrepository.findById(id);
		return stock.get();
	}
}
