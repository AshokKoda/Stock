package com.example.gudown;

public class GudownRepository {

	GudownService gService = new GudownService();

	public void addGudowns() {
		gService.addGudown();
	}
	
	public void getAllGudowns() {
		gService.getAllGudowns();
	}
	
	public void getGudownsStock() {
		gService.getGudownStock();
	}
}
