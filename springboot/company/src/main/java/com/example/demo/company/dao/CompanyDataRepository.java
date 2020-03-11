package com.example.demo.company.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.company.pojos.CompanyData;





public interface CompanyDataRepository  extends CrudRepository<CompanyData,String> {
	
	
	
}
