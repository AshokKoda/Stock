package com.example.dbconnection;

public class Common {

	public static final String DBURL = "jdbc:mysql://localhost:3306/stockdb";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "Koda@1996";
	
	
	public static final String INSERT = "insert into gudowns(gname, glocation, gcapacity)values(?, ?, ?);";
	public static final String FETCH = "select * from gudowns;";
	
	public static final String INSERT_STOCK = "insert into stock(name, gid, units)values(?, ?, ?);";
	public static final String FETCH_STOCK = "select * from stock;";
	
	public static final String GET_GUDOWN_STOCK = "select s.name,g.gname, g.glocation, gcapacity from stock s, gudowns g where s.gid = g.gid;";
	
	//public static final String GET_STOCK_BY_GUDOWN = "select name from stock where gid = 1;";
	
	
}
