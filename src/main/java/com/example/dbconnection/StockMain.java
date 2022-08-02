package com.example.dbconnection;

import java.util.Scanner;

public class StockMain {

	static Scanner sc;

	public static void main(String[] args) {
		System.out.println("************** Welcome to stock management system ************** ");

		StockMain main = new StockMain();
		GudownRepository gRepo = new GudownRepository();

		boolean exit = false;
		while (!exit) {
			System.out.println(" 1.STOCK\n 2.GUDOWN\n 3.GET ALL GUDOWN STOCK\n 4.SEARCH STOCKS BY GUDOWNS\n 0.Exit");
			System.out.println("------- Select the options -------");
			sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {
			case 1:
				main.stockManagement();
				break;
			case 2:
				main.gudownManagement();
				break;
			case 3:
				gRepo.getGudownStock();
				break;
			case 4:
				gRepo.searchStockByGudownId();
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

	public void stockManagement() {
		StockRepository stockRepo = new StockRepository();
		boolean exit = false;
		while (!exit) {
			System.out.println("1.GET STOCK\t 2.ADD STOCK\t 0.Exit");
			System.out.println("------- Select the options -------");
			sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {
			case 1:
				stockRepo.getAllStock();
				break;
			case 2:
				stockRepo.addStock();
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

	public void gudownManagement() {
		GudownRepository gRepo = new GudownRepository();
		boolean exit = false;
		while (!exit) {
			System.out.println("1.GET GUDOWNS\t 2.ADD GUDOWN\t 0.Exit");
			System.out.println("------- Select the options -------");
			sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {
			case 1:
				gRepo.getAllGudowns();
				break;
			case 2:
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
