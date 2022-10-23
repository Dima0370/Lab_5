package com.lab5.command;

public class Commands {
	private Command allocateMoneyBudget;
	private Command buyToys;
	private Command sortByPrice;
	private Command sortByCount;
	private Command findByPrice;
	private Command findByCount;

	public Commands(Command allocateMoneyBudget, Command buyToys, Command sortByPrice, Command sortByCount,
			Command findByPrice, Command findByCount) {

		this.allocateMoneyBudget = allocateMoneyBudget;
		this.buyToys = buyToys;
		this.sortByPrice = sortByPrice;
		this.sortByCount = sortByCount;
		this.findByPrice = findByPrice;
		this.findByCount = sortByCount;
	}

	public void allocateMoneyBudget() {

		allocateMoneyBudget.execute();
	}

	public void buyToys() {

		buyToys.execute();
	}

	public void sortByPrice() {

		sortByPrice.execute();
	}

	public void sortByCount() {

		sortByCount.execute();
	}

	public void findByPrice() {

		findByPrice.execute();
	}

	public void findByCount() {

		findByCount.execute();
	}
}
