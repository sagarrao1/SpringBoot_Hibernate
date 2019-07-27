package com.javabrains;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ProductCatalog {

	@WebMethod
	public List<String> getProductCatergories(){
		  List<String> categories =new ArrayList<String>();
		  	categories.add("Books");
		  	categories.add("Music");
		  	categories.add("Movies");
		  	categories.add("Games");		  
		
		return categories; 
	}
}
