package com.example.gudown;

import java.util.List;

public interface IGudown {

	public void addGudown();

	public List<Gudown> getAllGudowns();

	public void updateGudown(Gudown updateGudown);

	public void deleteGudown(Gudown deleteGudown);
	
	public void getGudownStock();
	
	public void searchStockByGudownId();
}
