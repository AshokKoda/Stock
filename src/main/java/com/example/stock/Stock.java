package com.example.stock;

public class Stock {

	private int stockId;
	private String stockName;
	private int gudownList;
	private int units;

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

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", gudownList=" + gudownList + ", units="
				+ units + "]";
	}

}
