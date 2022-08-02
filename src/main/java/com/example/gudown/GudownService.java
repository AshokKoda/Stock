package com.example.gudown;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GudownService implements IGudown {

	static Scanner sc;
	List<Gudown> list;
	
	public GudownService() {
		this.list = new ArrayList<Gudown>();
	}

	public void addGudown() {
		System.out.println("------------------- ADD NEW GUDOWN -------------------");
		Gudown gudown = new Gudown();
		sc = new Scanner(System.in);

		System.out.println("Enter gudown name: ");
		String gudownName = sc.nextLine();
		gudown.setgName(gudownName);

		System.out.println("Enter gudown location: ");
		String gudownLocation = sc.nextLine();
		gudown.setgLocation(gudownLocation);

		System.out.println("Enter gudown capacity: ");
		int gudownCapacity = sc.nextInt();
		gudown.setgCapacity(gudownCapacity);

		list.add(gudown);
		System.out.println("New gudown added successfully...!");
		System.out.println("-------------------------------------------------------------");

	}

	public List<Gudown> getAllGudowns() {
		if (list.isEmpty()) {
			System.out.println("No records found!");
		} else {
			System.out.println("Total Gudowns: " + list.size());
			for (Gudown gudown : list) {
				System.out.println("ID: " + list.indexOf(gudown) + ":" +  gudown);
			}
		}
		System.out.println("-------------------------------------------------------------");
		return list;
		
	}

	public void updateGudown(Gudown updateGudown) {
		// TODO Auto-generated method stub

	}

	public void deleteGudown(Gudown deleteGudown) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getGudownStock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchStockByGudownId() {
		// TODO Auto-generated method stub
		
	}
}
