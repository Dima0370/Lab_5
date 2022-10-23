package com.lab5.menu;

import java.util.ArrayList;
import java.util.Scanner;

import com.lab5.command.*;
import com.lab5.gameroom.GameRoom;

public class Menu {

	public void startMenu() {

		Scanner sc = new Scanner(System.in);

		ArrayList<GameRoom> gameRoom = new ArrayList<>();
		Command allocateMoneyBudget = new AllocateMoneyBudget(gameRoom);
		Command buyToys = new BuyToys(gameRoom);
		Command sortByPrice = new SortByPrice(gameRoom);
		Command sortByCount = new SortByCount(gameRoom);
		Command findByPrice = new FindByPrice(gameRoom);
		Command findByCount = new FindByCount(gameRoom);
		Commands start = new Commands(allocateMoneyBudget, buyToys, sortByPrice, sortByCount, findByPrice, findByCount);

		while (true) {

			displayMenu();

			switch (sc.next()) {

			case "1": {
				start.allocateMoneyBudget();
				break;
			}

			case "2": {
				start.buyToys();
				break;
			}

			case "3": {
				printToyList();
				break;
			}

			case "4": {
				start.sortByPrice();
				break;
			}

			case "5": {
				start.sortByCount();
				break;
			}

			case "6": {
				start.findByPrice();
				break;
			}

			case "7": {
				start.findByCount();
				break;
			}

			case "8": {
				System.exit(0);
				break;
			}

			default: {
				System.out.println("\nНеправильна команда, спробуйте ще раз\n");
			}

			}

		}

	}

	public static void displayMenu() {

		System.out.println("\n Введiть одну з команд: \n");
		System.out.println("1 - Видiлити бюджет для iгрової кiмнати");
		System.out.println("2 - Купити iграшки для iгрової кiмнати");
		System.out.println("3 - Вивести список куплених iграшок");
		System.out.println("4 - Вiдсортувати iграшки за цiною");
		System.out.println("5 - Вiдсортувати iграшки за кiлькiстю");
		System.out.println("6 - Знайти iграшки в дiапазонi цiн");
		System.out.println("7 - Знайти iграшки в дiапазонi кiлькостi");
		System.out.println("8 - Вийти з програми\n");
	}

	public static void printToyList() {

	}

}
