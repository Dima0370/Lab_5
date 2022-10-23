package com.lab5.gameroom;

public class GameRoom {

	private int moneyBudget;
	private String typeOfToy;
	private int price;
	private int count;

	public GameRoom() {}

	public GameRoom(String typeOfToy, int price, int count) {
		this.typeOfToy = typeOfToy;
		this.price = price;
		this.count = count;
	}

	public int getMoneyBudget() {
		return moneyBudget;
	}

	public void setMoneyBudget(int moneyBudget) {
		this.moneyBudget = moneyBudget;
	}

	public String getTypeOfToy() {
		return typeOfToy;
	}

	public void setTypeOfToy(String typeOfToy) {
		this.typeOfToy = typeOfToy;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "moneyBudget = " + moneyBudget + ", typeOfToy = " + typeOfToy + ", price = " + price + ", count = "
				+ count;
	}

}
