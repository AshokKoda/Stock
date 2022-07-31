package com.example.dbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.gudown.Gudown;
import com.example.gudown.IGudown;

public class GudownService implements IGudown {

	static Scanner sc;
	static DBConnection dbConnection;
	List<Gudown> list;
	Connection connection;

	public GudownService() {
		this.list = new ArrayList<Gudown>();
		dbConnection = DBConnection.init();
		connection = dbConnection.getConnection();
	}

	public void addGudown() {
		System.out.println("------------------- ADD NEW GUDOWN -------------------");
		sc = new Scanner(System.in);

		try {
			PreparedStatement ps = connection.prepareStatement(Common.INSERT);
			System.out.println("Enter gudown name: ");
			String gudownName = sc.nextLine();
			ps.setString(1, gudownName);

			System.out.println("Enter gudown location: ");
			String gudownLocation = sc.nextLine();
			ps.setString(2, gudownLocation);

			System.out.println("Enter gudown capacity: ");
			int gudownCapacity = sc.nextInt();
			ps.setInt(3, gudownCapacity);

			int status = ps.executeUpdate();
			if (status > 0) {
				System.out.println("New gudown added successfully...!");
			} else {
				System.out.println("Something went wrong...please try again!!!");
			}
		} catch (SQLException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		System.out.println("<------------------------------------------------------->");
	}

	public List<Gudown> getAllGudowns() {
		System.out.println("------------------- GET ALL GUDOWNS -------------------");
		try {
			PreparedStatement ps = connection.prepareStatement(Common.FETCH);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Gudown gudown = new Gudown();
				gudown.setgId(rs.getInt("gid"));
				gudown.setgName(rs.getString("gname"));
				gudown.setgLocation(rs.getString("glocation"));
				gudown.setgCapacity(rs.getInt("gcapacity"));
				list.add(gudown);
			}
			
			if (list.isEmpty()) {
				System.out.println("No records found!");
			} else {
				list.forEach(g -> {
					System.out.println("ID: " + g.getgId());
					System.out.println("Goudown name: " + g.getgName());
					System.out.println("Gudown location: " + g.getgLocation());
					System.out.println("Gudown capacity: " + g.getgCapacity());
					System.out.println("<--------------------------------------------------->");
				});
			}
			
		} catch (SQLException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		return list;

	}

	public void updateGudown(Gudown updateGudown) {
		// TODO Auto-generated method stub

	}

	public void deleteGudown(Gudown deleteGudown) {
		// TODO Auto-generated method stub

	}
}
