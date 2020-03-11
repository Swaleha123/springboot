package com.example.demo.stockprice.Controller;

import java.util.List;
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

import com.example.demo.stockprice.dao.StockExchangeRepository;
import com.example.demo.stockprice.pojos.StockExchange;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/stockExchange")
public class StockExchangeController {

	@Autowired
	private StockExchangeRepository stockexchangeRepository;

	@RequestMapping("/getAllStockExchange")
	public Iterable<StockExchange> getAllUser() {
		return stockexchangeRepository.findAll();
	}

	@PostMapping("/saveStockExchange")
	public StockExchange saveStock(@RequestBody StockExchange stock) {
		System.out.println(stock);
		stockexchangeRepository.save(stock);
		return stock;
	}

	@PutMapping("/putstockExchange/{stockExchange}")
	public StockExchange updateStock(@RequestBody StockExchange stock, @PathVariable("stockExchange") String stockExchange) {

		stock.setStockExchange(stockExchange);
		System.out.println(stock);

		stockexchangeRepository.save(stock);
		return stock;
	}

	@DeleteMapping("/deletestockExchange/{stockExchange}")
	public boolean deleteStock(@PathVariable("stockExchange") String stockExchange) {

		System.out.println(stockExchange);

		stockexchangeRepository.deleteById(stockExchange);;
		return true;
	}

	@GetMapping("/findstockExchange/{stockExchange}")
	public StockExchange findAllinOne(@PathVariable("stockExchange") String stockExchange) {

		Optional<StockExchange> stock = stockexchangeRepository.findById(stockExchange);
		return stock.get();
	}
	@GetMapping("/findByStockExchange/{stockExchange}")

	 public List<StockExchange> findByStockExchange(@PathVariable("stockExchange") String stockExchange)

	 {

	 List<StockExchange> stockexchange= stockexchangeRepository.findByStockExchange(stockExchange);

	 return stockexchange;

	 }

	
}
