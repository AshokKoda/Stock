package com.example.stock;

public class StockRepository {

	StockService stockService = new StockService();
	
	public void addStock() {
		stockService.addStock();
	}
	
	public void getAllStock(){
		stockService.getAllStock();
	}
}
