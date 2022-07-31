package com.example.stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.example.gudown.GudownService;

public class StockService implements IStock {

	static Scanner sc;
	List<Stock> list;
	//List<Gudown> gList;
	
	public StockService() {
		this.list = new ArrayList<Stock>();
	}
	
	@Override
	public void addStock() {
		System.out.println("------------------- ADD NEW GUDOWN -------------------");
		Stock stock = new Stock();
		sc = new Scanner(System.in);

		System.out.println("Enter stock name: ");
		String stockName = sc.nextLine();
		stock.setStockName(stockName);

		System.out.println("Select gudowns: ");
		GudownService gService = new GudownService();
		gService.getAllGudowns();
		
//		GudownService gudownList = new GudownService();
//		List<Gudown> gList = gudownList.getAllGudowns();
//		if(gList.isEmpty()) {
//			System.out.println("Gudowns are not avaliable!");
//		}else {
//			int id = sc.nextInt();
//			Gudown g = new Gudown();
//			
//			if(gList.indexOf(g) == id) {
//				gList.add(g);
//				stock.setGudownList(gList);
//			}
//		}
		

		list.add(stock);
		System.out.println("New stock added successfully...!");
		System.out.println("-------------------------------------------------------------");
		
	}

	@Override
	public List<Stock> getAllStock() {
		if (list.isEmpty()) {
			System.out.println("No records found!");
		} else {
			System.out.println("Total stock: " + list.size());
			for (Stock stock : list) {
				System.out.println("ID: " + list.indexOf(stock) + ":" +  stock);
			}
		}
		System.out.println("-------------------------------------------------------------");
		return list;
	}

	@Override
	public void updateStock(Stock updateStock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStock(Stock deleteStock) {
		// TODO Auto-generated method stub
		
	}

}
