package com.example.dbconnection;

public class Common {

	public static final String DBURL = "jdbc:mysql://localhost:3306/stockdb";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "Koda@1996";
	
	
	public static final String INSERT = "insert into gudown(gname, glocation, gcapacity)values(?, ?, ?);";
	public static final String FETCH = "select * from gudown;";
	
	public static final String INSERT_STOCK = "insert into stock(name, gid)values(?, ?);";
	public static final String FETCH_STOCK = "select * from stock;";
	
	
}
