package com.example.dbconnection;

public class StockRepository {

	StockService stockService = new StockService();
	
	public void addStock() {
		stockService.addStock();
	}
	
	public void getAllStock(){
		stockService.getAllStock();
	}
}
