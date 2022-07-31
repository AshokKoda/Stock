package com.example;

import java.util.Scanner;
import com.example.gudown.GudownRepository;
import com.example.stock.StockRepository;

public class StockMain {

	static Scanner sc;

	public static void main(String[] args) {
		System.out.println("************** Welcome to stock management system ************** ");

		StockRepository stockRepo = new StockRepository();
		GudownRepository gRepo = new GudownRepository();

		boolean exit = false;
		while (!exit) {
			System.out.println("1.GET STOCK\t 2.GET GUDOWNS\t 3.ADD STOCK\t 4.ADD GUDOWNS\t 0.Exit");
			System.out.println("------- Select the options -------");
			sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {
			case 1:
				stockRepo.getAllStock();
				break;
			case 2:
				gRepo.getAllGudowns();
				break;
			case 3:
				stockRepo.addStock();
				break;
			case 4:
				gRepo.addGudowns();
				break;
			case 0:
				exit = true;
				System.out.println("You are exit!.");
				break;
			default:
				System.out.println("Invalid option, please try again.");
				break;
			}
		}

	}

}
