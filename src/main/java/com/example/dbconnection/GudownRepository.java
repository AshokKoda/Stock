package com.example.dbconnection;

public class GudownRepository {

	GudownService gService = new GudownService();

	public void addGudowns() {
		gService.addGudown();
	}
	
	public void getAllGudowns() {
		gService.getAllGudowns();
	}
	
	public void getGudownStock() {
		gService.getGudownStock();
	}
	
	public void searchStockByGudownId() {
		gService.searchStockByGudownId();
	}
}
