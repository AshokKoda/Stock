package com.example.stock;

import java.util.List;

public interface IStock {

	public void addStock();

	public List<Stock> getAllStock();

	public void updateStock(Stock updateStock);

	public void deleteStock(Stock deleteStock);
}
