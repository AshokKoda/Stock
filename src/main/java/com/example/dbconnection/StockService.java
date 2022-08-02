package com.example.dbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.gudown.Gudown;
import com.example.stock.IStock;
import com.example.stock.Stock;

public class StockService implements IStock {

	static Scanner sc;
	static DBConnection dbConnection;
	List<Stock> list;
	List<Gudown> gudownList;
	Connection connection;

	public StockService() {
		this.list = new ArrayList<Stock>();
		this.gudownList = new ArrayList<Gudown>();
		dbConnection = DBConnection.init();
		connection = dbConnection.getConnection();
	}

	public void addStock() {
		System.out.println("------------------- ADD NEW GUDOWN -------------------");
		sc = new Scanner(System.in);

		try {
			PreparedStatement ps = connection.prepareStatement(Common.INSERT_STOCK);
			System.out.println("Enter stock name: ");
			String stockName = sc.nextLine();
			ps.setString(1, stockName);
			
			System.out.println("Select gudowns: ");
			PreparedStatement fetch = connection.prepareStatement(Common.FETCH);
			ResultSet rs = fetch.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "." + rs.getString(2));
			}

			System.out.println("Enter the ID for storing the stock: ");
			int id = sc.nextInt();
			Gudown gud = new Gudown();
			if(gud.getgId() == id) {
				gudownList.add(gud);
			}
			ps.setInt(2, id);
			
			System.out.println("Enter the units: ");
			int units = sc.nextInt();
			ps.setInt(3, units);


			int status = ps.executeUpdate();
			if (status > 0) {
				System.out.println("New stock added successfully...!");
			} else {
				System.out.println("Something went wrong...please try again!!!");
			}

		} catch (SQLException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		System.out.println("-------------------------------------------------------------");

	}

	public List<Stock> getAllStock() {
		System.out.println("------------------- GET ALL STOCKS -------------------");
		try {
			PreparedStatement ps = connection.prepareStatement(Common.FETCH_STOCK);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Stock stock = new Stock();
				stock.setStockId(rs.getInt("stockid"));
				stock.setStockName(rs.getString("name"));
				stock.setGudownList(rs.getInt("gid"));
				list.add(stock);
			}

			if (list.isEmpty()) {
				System.out.println("No records found!");
			} else {
				list.forEach(stock -> {
					System.out.println("ID: " + stock.getStockId());
					System.out.println("Stock name: " + stock.getStockName());
					System.out.println("Gudown: " + stock.getGudownList());
					System.out.println("<--------------------------------------------------->");
				});
			}

		} catch (SQLException e) {
			System.out.println("Exception: " + e.getMessage());
		}
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
