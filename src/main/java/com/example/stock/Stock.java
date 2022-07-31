package com.example.stock;

public class Stock {

	private int stockId;
	private String stockName;
	private int gudownList;

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getGudownList() {
		return gudownList;
	}

	public void setGudownList(int gudownList) {
		this.gudownList = gudownList;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", gudownList=" + gudownList + "]";
	}

}
